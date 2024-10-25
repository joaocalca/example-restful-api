package dev.joaocalca.santander.service;

import dev.joaocalca.santander.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
