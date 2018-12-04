package com.imooc.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 采用@PreAuthorize注解实现权限控制
 */
@RestController
public class DemoController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/common")
    public String commonAccess(){
        return "only login can view";
    }

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")  //实现权限控制
    public String admin(){
        return "only admin can access";
    }
}
