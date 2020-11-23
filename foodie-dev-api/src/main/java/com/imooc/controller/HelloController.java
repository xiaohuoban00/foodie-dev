package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhang Song on 2020/8/5 21:00
 */
@RestController
public class HelloController {
    static HashMap<String, String> map1= new HashMap<String, String>(){{
        put(""," ");
    }};
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/test")
    public Map test(@RequestBody Map<String,Object> source){
        System.out.println(source);
        Map<String,Integer> map = new HashMap<>();
        map.put("code",1);
        return map;
    }
}
