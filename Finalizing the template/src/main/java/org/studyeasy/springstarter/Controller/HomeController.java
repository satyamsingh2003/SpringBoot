package org.studyeasy.springstarter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    
        @GetMapping("/")
        public String start(Model model) {
            model.addAttribute("message", "Hello, World!");
            return "home";  }


}

