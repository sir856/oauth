package config;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String getUser(Model model, OAuth2Authentication authentication) {

        model.addAttribute("user", authentication.getUserAuthentication());
        return "user";
    }
}
