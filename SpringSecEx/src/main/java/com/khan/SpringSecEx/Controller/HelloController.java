package com.khan.SpringSecEx.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String Hello(HttpServletRequest request){
        return  "Welcome to the hardworkng era!! <br>" + request.getSession().getId();
    }
}
