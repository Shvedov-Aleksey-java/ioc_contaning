package io.containing.annotationConfigure.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
public class User {
    private String name;
    private Integer size;
    private List<Double> list;
    private Map<Integer, String> map;

    @PostConstruct
    public void init() {
        System.out.println("init User");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy User");
    }
}
