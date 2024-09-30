package com.oauth.oauth2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcomePage() {
        // This will return the "welcome.html" from templates directory
        return "welcome";
    }
}
