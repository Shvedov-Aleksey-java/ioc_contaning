package io.containing.XmlConfigure.model;

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

    public void init() {
        System.out.println("init User");
    }

    public void destroy() {
        System.out.println("destroy User");
    }
}
