package io.containing.annotationConfigure.service;

import io.containing.annotationConfigure.mapper.Mapper;
import io.containing.annotationConfigure.model.User;
import io.containing.annotationConfigure.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class UserService {
    private final UserRepository repository;
    private final Mapper mapper;
    private final User user;
}
