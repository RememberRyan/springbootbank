package sda.springbootbank.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 * Created by Ryan Alexander on 26/11/2018.
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfigBasic extends WebSecurityConfigurerAdapter {

    @Autowired
            // Interface type Bean. What you want to inject
    UserDetailsService userDetailsServiceImplementation;

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
//
//    // one user in memory, not form database. Only user that can login.
//    // this does not mask the password
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService(){
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                    .username("u")
//                    .password("p")
//                    .roles("USER")
//                    .build();
//        return new InMemoryUserDetailsManager(user);
//    }

    // login with database

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(userDetailsServiceImplementation)
                // for test purposes, we are disabling the password encoder
                .passwordEncoder(NoOpPasswordEncoder.getInstance());
    }
}
