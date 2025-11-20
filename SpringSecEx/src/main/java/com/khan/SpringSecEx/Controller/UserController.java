package com.khan.SpringSecEx.Controller;

import com.khan.SpringSecEx.Model.Users;
import com.khan.SpringSecEx.Service.JWTService;
import com.khan.SpringSecEx.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;
//    @Autowired
//    private JWTService jwtService;
    @PostMapping("/register")
    public Users register(@RequestBody  Users user){
        return  service.register(user);
    }
    @PostMapping("/login")
    public  String Login(@RequestBody Users user){
      //  return jwtService.generateToken(user.getUsername());
    return  service.verify(user);
       // return "success";
    }


}
