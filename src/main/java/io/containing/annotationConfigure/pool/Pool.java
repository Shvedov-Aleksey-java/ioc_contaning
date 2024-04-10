package io.containing.annotationConfigure.pool;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pool {
    private String name;
    private String password;
    private Integer poolSize;
    private String url;
}
