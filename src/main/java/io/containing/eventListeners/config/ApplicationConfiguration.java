package io.containing.eventListeners.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("io.containing.eventListeners")
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {

}
