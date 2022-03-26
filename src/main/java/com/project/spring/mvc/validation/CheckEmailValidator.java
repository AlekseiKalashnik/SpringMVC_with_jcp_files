package com.project.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator
        implements ConstraintValidator<CheckEmail, String> {
    /*в парамметрах наша аннотация и тип,
     * который мы собираемся ей обрабатывать(email - String)*/

    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value();
        //получяем конечню часть нашего email
    }

    @Override
    public boolean isValid(String enteredValue,
                           ConstraintValidatorContext constraintValidatorContext) {
        //enteredValue - значение, которое будем вводить в форме страницы
        return enteredValue.endsWith(endOfEmail);
        //проверяем равны ли они
    }
}
