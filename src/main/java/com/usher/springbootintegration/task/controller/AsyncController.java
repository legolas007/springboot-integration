package com.usher.springbootintegration.task.controller;

import com.usher.springbootintegration.task.service.ASyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Usher
 * @Description:
 */
@RestController
public class AsyncController {

    @Autowired
    private ASyncService asyn;
    @GetMapping("/hello")
    public String hell0(){
        asyn.hello();
        return "success";
    }
}
