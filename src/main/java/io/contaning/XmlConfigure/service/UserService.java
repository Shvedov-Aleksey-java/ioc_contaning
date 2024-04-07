package io.contaning.XmlConfigure.service;

import io.contaning.XmlConfigure.mapper.Mapper;
import io.contaning.XmlConfigure.model.User;
import io.contaning.XmlConfigure.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class UserService {
    private final UserRepository repository;
    private final Mapper mapper;
    private final User user;
}
