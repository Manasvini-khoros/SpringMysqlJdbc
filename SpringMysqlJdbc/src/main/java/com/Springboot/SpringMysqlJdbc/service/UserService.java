package com.Springboot.SpringMysqlJdbc.service;

import com.Springboot.SpringMysqlJdbc.entity.User;
import com.Springboot.SpringMysqlJdbc.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository urepository;

    public User insertUser (User user){
        return urepository.save(user);
    }

    public List<User> getUsers(){
        return urepository.findAll();
    }

    public User getUser(int id){
        return urepository.findById(id).orElse(null);
    }

    public String deleteUser(int id){
        urepository.deleteById(id);
        return "deleted user";
    }

    public User updateUser(User user){
        User u=urepository.findById(user.getId()).orElse(null);
        u.setName(user.getName());
        return urepository.save(u);
        //return "updated user details";


    }
}
