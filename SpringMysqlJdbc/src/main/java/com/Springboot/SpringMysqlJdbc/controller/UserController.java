package com.Springboot.SpringMysqlJdbc.controller;

import com.Springboot.SpringMysqlJdbc.entity.User;
import com.Springboot.SpringMysqlJdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping(value="/add")
    public User insert(@RequestBody User user){
        return service.insertUser(user);
    }

    @GetMapping("/users")
    public List<User>  get() {
        return service.getUsers();
    }

    @GetMapping("/user/{id}")
    public User get1(@PathVariable int id){
        return service.getUser(id);
    }

    @DeleteMapping("/delete user/{id}")
    public String delete(@PathVariable int id){
        return service.deleteUser(id);
    }

    @PutMapping("/update user")
    public User update(@RequestBody User user){
        return service.updateUser(user);
    }
}
