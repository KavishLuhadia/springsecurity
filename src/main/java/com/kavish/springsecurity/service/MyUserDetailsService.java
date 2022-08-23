package com.kavish.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

    //Returing hardcoded values of username and password..normally it will come from database
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("foo", "foo",new ArrayList<>());
    }
}