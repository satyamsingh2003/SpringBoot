package org.studyeasy.springstarter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/home")
    // Url Request will come here whenever you try to access localhost:8080/home and will return home.html
    public String home(Model model) {
        return "home";  }
    
        @GetMapping("/")
        public String start(Model model) {
            return "home";  }

        @GetMapping("/about")
    public String about(Model model) {
            return "about";  }
}

