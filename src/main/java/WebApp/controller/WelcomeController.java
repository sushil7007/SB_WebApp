package WebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("/getwelcome")
    public ModelAndView welcome() {

        String msg = "Hi Welcome to Spring Boot JSP";

        ModelAndView mv = new ModelAndView();
        mv.addObject("welcomeMsg", msg);
        mv.setViewName("h");

        return mv;
    }
}
