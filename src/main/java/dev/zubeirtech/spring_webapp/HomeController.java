package dev.zubeirtech.spring_webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(HttpServletRequest req) {
        System.out.println(req.toString());
        return "home";
    }
}
