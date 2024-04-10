package io.containing.fullAnnotation.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
@Component
public class User {
    private String username;
    private String password;
    private String driver;
    private Integer size;

    @PostConstruct
    public void init() {
        System.out.println("init User");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy User");
    }
}
