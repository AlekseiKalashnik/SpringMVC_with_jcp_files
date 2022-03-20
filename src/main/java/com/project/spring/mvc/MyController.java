package com.project.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @GetMapping("askDetails")
    public String askEmployeeDetails() {
        return "askDetails-view";
    }

    @GetMapping("showDetails")
    public String showEmployeeDetails() {
        return "showDetails-view";
    }
}
