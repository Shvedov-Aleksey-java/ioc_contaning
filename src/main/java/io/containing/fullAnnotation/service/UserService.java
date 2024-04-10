package io.containing.fullAnnotation.service;

import io.containing.fullAnnotation.model.User;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * для того что бы подтянуть бин с другим именем испольуем @Qualifier("getUser") вместе с @Autowired
 */

@ToString
@Service
public class UserService {
    private final User user;


    @Autowired
    public UserService(@Qualifier("getUser") User user) {
        this.user = user;
    }
}
