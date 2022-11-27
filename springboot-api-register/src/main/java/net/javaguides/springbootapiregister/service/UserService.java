package net.javaguides.springbootapiregister.service;

import net.javaguides.springbootapiregister.entity.User;

import java.util.List;

public interface UserService {
    List<User> searchUsers(String query);

    User createUser(User user);
}
