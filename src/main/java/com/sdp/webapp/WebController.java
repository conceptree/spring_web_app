package com.sdp.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(Model model){
        System.out.printf("Hello World!");
        model.addAttribute("message", "Greetings From the server!");
        return "hello";
    }

}
