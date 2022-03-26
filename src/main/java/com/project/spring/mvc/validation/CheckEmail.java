package com.project.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
/*самый долговечный тип аннотации, доживает до RUNTIME
 * наша аннотация будет сохраняться до выполнения кода*/
@Constraint(validatedBy = CheckEmailValidator.class)
/*класс, который бедет обрабатывать эту аннотацию*/
public @interface CheckEmail {

    public String value() default "xyz.com";

    public String message() default "email must ends with xyz.com";
    /*эти значения заменяются, если мы в парамметрах аннотации
     * над полем укажем свои значния*/

    public Class<?>[] groups() default {};

    /*позволяет разбивать аннотации по группам*/
    public Class<? extends Payload>[] payload() default {};
    /*для переноса информации методанных клиента*/
}
