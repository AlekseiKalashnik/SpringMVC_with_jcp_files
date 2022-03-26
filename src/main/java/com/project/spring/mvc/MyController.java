package com.project.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                      BindingResult bindingResult) {
        /*получаем через парамметр доступ к атрибуту и можем менять его поля в методе.
        @Valid - наш атрибут employee будет подвергаться проверке(валидации).
        bindingResult - сюда будет помещен результат валидации employee*/
        if (bindingResult.hasErrors()) {
            return "askDetails-view";
        } else
            return "showDetails-view";
    }
}
