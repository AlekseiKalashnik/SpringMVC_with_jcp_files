package com.project.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "askDetails-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {
        /*получаем через парамметр доступ к атрибуту и можем менять его поля в методе*/
        String addMrToName = employee.getName();
        employee.setName("Mr." + addMrToName);

        String addExclamationMarkToSurname = employee.getName();
        employee.setName(addExclamationMarkToSurname + "!");

        int salaryMultiplyTen = employee.getSalary();
        employee.setSalary(salaryMultiplyTen * 10);

        return "showDetails-view";
    }
}
