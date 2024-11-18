package org.studyeasy.springstarter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/") // Handle requests to the root URL
    public String index(Model model) {
        model.addAttribute("message", "Welcome to the Home Page!"); // Optional: add a message
        return "home"; // Assuming you have a home.html file in src/main/resources/templates
    }
    @GetMapping("/home")
    public String home(Model model){
        return "home";
    }
}
