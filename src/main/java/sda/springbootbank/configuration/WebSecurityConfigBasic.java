package sda.springbootbank.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created by Ryan Alexander on 26/11/2018.
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfigBasic extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // cross side forgery built-in security - from your app, nothing else
        http.csrf().disable()
                .authorizeRequests()
                    // homepage is permitted access for everyone
                    .antMatchers("/").permitAll()
                    .anyRequest().authenticated()
                .and()
                    // login, permitted to all
                    .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    // logout access permitted to all
                .and()
                    .logout()
                    .permitAll();
    }

    // one user in memory, not form database. Only user that can login.
    // this does not mask the password
    @Bean
    @Override
    public UserDetailsService userDetailsService(){
        UserDetails user =
                User.withDefaultPasswordEncoder()
                    .username("u")
                    .password("p")
                    .roles("USER")
                    .build();
        return new InMemoryUserDetailsManager(user);
    }
}
