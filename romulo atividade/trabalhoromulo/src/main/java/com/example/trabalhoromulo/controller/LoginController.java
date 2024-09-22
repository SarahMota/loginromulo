package com.example.trabalhoromulo.controller;  

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PostMapping;  

@Controller  
public class LoginController {  

    @GetMapping("/login")  
    public String login() {  
        return "login";
    }  

    @PostMapping("/login")  
    public String loginPost(String username, String password, Model model) {  
        if ("Wine".equals(username) && "1234".equals(password)) {  
            return "redirect:/wine"; 
        } else {  
            model.addAttribute("error", "Login inválido");  
            return "redirect:/error";
        }  
    } 

    @GetMapping("/wine")  
    public String wine() {  
        return "wine"; 
    }  

    @GetMapping("/error")  
    public String error() {  
        return "error"; 
    } 
        
    @GetMapping("/developer")  
    public String developerInfo() {  
        return "developer"; 
    }  
}  