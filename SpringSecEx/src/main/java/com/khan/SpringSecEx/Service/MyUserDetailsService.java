package com.khan.SpringSecEx.Service;

import com.khan.SpringSecEx.Model.UserPrinciple;
import com.khan.SpringSecEx.Model.Users;
import com.khan.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
   @Autowired
    private UserRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user =repo.findByUsername(username);
        if(user==null){
            System.out.println("No user found with username");
            throw new UsernameNotFoundException("user not found");
        }
        return new UserPrinciple(user);
    }
}
