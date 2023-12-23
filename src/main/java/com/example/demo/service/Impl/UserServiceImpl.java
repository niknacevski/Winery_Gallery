package com.example.demo.service.Impl;


import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User register(String username, String password, String repeatPassword, String email, Role role) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty())
            throw new IllegalArgumentException();
        if (!password.equals(repeatPassword))
            throw new IllegalArgumentException();
        if (repository.findByUsername(username).isPresent())
            throw new IllegalArgumentException();
        User user = new User(username, password, email, role);
        return repository.save(user);

    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username).get();
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return repository.findByUsernameAndPassword(username, password).get();
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.findByUsername(username);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }


    @Override
    public boolean isUserInList(String username, List<User> userList) {
        boolean inList = false;
        for (User u : userList) {
            if (u.getUsername().equals(username)) {
                inList = true;
                break;
            }
        }
        return inList;
    }
}