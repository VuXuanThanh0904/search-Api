package net.javaguides.springbootapiregister.service.impl;

import net.javaguides.springbootapiregister.entity.User;
import net.javaguides.springbootapiregister.repository.UserRepository;
import net.javaguides.springbootapiregister.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> searchUsers(String query) {
        List<User> users = userRepository.searchUsers(query);
        return users;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
