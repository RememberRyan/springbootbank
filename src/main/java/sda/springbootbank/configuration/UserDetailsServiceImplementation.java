package sda.springbootbank.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sda.springbootbank.dto.User;
import sda.springbootbank.repositories.UserRepository;

/**
 * Created by Ryan Alexander on 26/11/2018.
 */
@Service
public class UserDetailsServiceImplementation implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // by username we should find
        User userFromDb = userRepository.findByUsername(username);
        if (userFromDb == null)
            return null;

        return org.springframework.security.core.userdetails.User.builder()
                .username(username)
                .password(userFromDb.getPassword())
                .roles("USER")
                .build();
    }
}
