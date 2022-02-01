package com.francisco.course.services;

import com.francisco.course.entities.User;
import com.francisco.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        List<User> list = userRepository.findAll();
        return list;
    }

    public User findById(Long id){
        Optional<User> opt = userRepository.findById(id);
        return opt.get();
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }

}
