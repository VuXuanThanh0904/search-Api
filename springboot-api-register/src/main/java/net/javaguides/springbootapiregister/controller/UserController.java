package net.javaguides.springbootapiregister.controller;

import net.javaguides.springbootapiregister.entity.User;
import net.javaguides.springbootapiregister.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUsers(@RequestParam("query") String query){
        return ResponseEntity.ok(userService.searchUsers(query));
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
