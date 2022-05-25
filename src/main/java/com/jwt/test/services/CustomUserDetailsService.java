package com.jwt.test.services;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		 if(userName.equals("maneesh")){//here you can make a DB call with the help of repository and do the validation
	            return new User("maneesh", "maneesh", new ArrayList<>());//assume these are returned from DB upon success
	        }else{
	            throw new UsernameNotFoundException("User does not exist!");
	        }

   }
}
