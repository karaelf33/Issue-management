package com.temelt.issuemanagment.service.impl;

import com.temelt.issuemanagment.entity.User;
import com.temelt.issuemanagment.repository.UserRepository;
import com.temelt.issuemanagment.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) throws IllegalAccessException {
        if (user.getEmail() == null) {
            throw new IllegalAccessException("username cannot be null");
        }
        return user;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public User getByUserName(String username) {
        return null;
    }
}
