package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        // HTMLに渡すデータをセット
        model.addAttribute("message", "Javaから渡されたメッセージです！");
        
        // templates/hello.html を呼び出す（拡張子の .html は省略）
        return "hello"; 
    }
}