package com.example.ThymeLeaf.Demo.controller;

import com.example.ThymeLeaf.Demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("hello")
    public String helloWorld(Model model){
    User user=new User("lloyd","@ymail.com");
    model.addAttribute("user",user);
            return "hello";
    }

    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        User user=new User("lloyd","llo@yail.com");
                model.addAttribute("user",user);
                return "selection-expression";

    }
    //handler method for message expression request
    //http:/localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression()
    {
        return "message-expression";
    }
}
