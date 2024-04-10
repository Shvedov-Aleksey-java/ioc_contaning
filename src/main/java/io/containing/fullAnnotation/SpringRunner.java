package io.containing.fullAnnotation;

import io.containing.fullAnnotation.config.ApplicationConfiguration;
import io.containing.fullAnnotation.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class); это реализацыя чисто без xml
 * конфигурации а через анотации теперь в роли файла конфигурации выступает дласс ApplicationConfiguration.class
 */
public class SpringRunner {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        UserService user = context.getBean(UserService.class);
        System.out.println(user);
        context.close();
    }


}