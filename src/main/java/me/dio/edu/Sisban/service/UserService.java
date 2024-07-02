package me.dio.edu.Sisban.service;

import me.dio.edu.Sisban.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
