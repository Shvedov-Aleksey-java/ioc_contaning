package io.containing.XmlConfigure.service;


import io.containing.XmlConfigure.mapper.Mapper;
import io.containing.XmlConfigure.repository.UserRepository;
import io.containing.XmlConfigure.model.User;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class UserService {
    private final UserRepository repository;
    private final Mapper mapper;
    private final User user;
}
