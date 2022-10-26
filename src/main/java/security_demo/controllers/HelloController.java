package security_demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import security_demo.security.PersonDetails;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/showUserInfo")
    public String show(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();
        System.out.println(personDetails.getPerson());
        return "hello";
    }
}
