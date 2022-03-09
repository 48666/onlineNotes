package com.example.onlineNotes.sevice.usr;

import com.example.onlineNotes.entities.Users;
import com.example.onlineNotes.repository.UserRepository;
import com.example.onlineNotes.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users byEmail = userRepository.findByEmail(username);
        if(byEmail==null){
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(byEmail);
    }
}
