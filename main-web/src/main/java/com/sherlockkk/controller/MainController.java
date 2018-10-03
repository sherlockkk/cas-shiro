package com.sherlockkk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping
    public String index(){
        return "index";
    }

    @RequestMapping("map")
    @ResponseBody
    public Map<String, Object> test(){
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", "");
        hashMap.put("name", null);
        hashMap.put("age", 12);
        hashMap.put("gender", true);
        hashMap.put("chrset", "张三丰");
        return hashMap;
    }

    @RequestMapping("test")
    public String test(String title, Model model) {
        model.addAttribute("title", title);
        return "index";
    }

    @RequestMapping("400")
    public String badRequest() {
        return "400";
    }

    @RequestMapping("404")
    public String notFound() {
        return "404";
    }

}
