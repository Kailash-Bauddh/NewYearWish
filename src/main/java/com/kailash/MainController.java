package com.kailash;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(@RequestParam(name="sender", required=false, defaultValue="Dost") String sender, Model model) {
        model.addAttribute("senderName", sender);
        return "index";
    }
}