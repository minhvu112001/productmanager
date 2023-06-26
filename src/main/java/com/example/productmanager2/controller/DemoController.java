package com.example.productmanager2.controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("theDate", new java.util.Date());
        return "helloworld";
    }
}