package com.example.cideback.service;
import com.example.cideback.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.cideback.model.User;
import com.example.cideback.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    // create user
//    public User createUser(User user) {
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);
//        user.setEnabled(true);
//        Role role = new Role();
//        role.setId(1l);
//        user.getRoles().add(role);
//        System.out.println("user Service!!!!! : " + user);
//        return userRepository.save(user);
//    }

//    public User SelectUserLogin(User user) {
//        System.out.println("user SelectUserLogin!!!!! : " + user);
//        String userid = user.getUserId();
//        String password = user.getUserId();
//        System.out.println("userid :  " + userid);
//        System.out.println("password :  " + password);
//        //User user1 = userRepository.findByUserId(userid);
//        //System.out.println("user : " + user1);
//        return userRepository.findByUserId(userid);
//    }


//    public User SelectUserLogin(User user) {
//        System.out.println("SelectUserLogin!!!!!");
//
//        return userRepository.findById(user);
//    }

}
