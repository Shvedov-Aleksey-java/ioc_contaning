package io.containing.eventListeners;

import io.containing.eventListeners.config.ApplicationConfiguration;
import io.containing.eventListeners.service.CompanyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class SpringRunner {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        var service = context.getBean(CompanyService.class);
        service.findById(1);
        context.close();
    }


}