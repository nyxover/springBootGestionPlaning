package com.gestionplaning.gestionplaning.service;

import com.gestionplaning.gestionplaning.entity.User;
import com.gestionplaning.gestionplaning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findAllButId(Long id) {
        return userRepository.findById(id);
    }


    //TODO recherche de contact
//    public List<User> searchContact(String search) {
//        return userRepository.findByFirstNameContainingOrLastNameContainingOrderByFirstNameAscLastNameAsc(search, search);
//    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}