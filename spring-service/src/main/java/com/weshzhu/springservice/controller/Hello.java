package com.weshzhu.springservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 *
 * @author by Zhu Shidong
 */
@RestController
@RequestMapping(value = "/computer-svc")
public class Hello {
    @GetMapping("/hello/{world}")
    public String hello(@PathVariable String world){
        return world;
    }
}
