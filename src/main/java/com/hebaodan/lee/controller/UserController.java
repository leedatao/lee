package com.hebaodan.lee.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    public String getUser(HttpServletRequest request, HttpServletResponse rep){


        return "testSucces";
    }
}
