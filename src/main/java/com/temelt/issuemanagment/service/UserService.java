package com.temelt.issuemanagment.service;

import com.temelt.issuemanagment.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save(User user) throws IllegalAccessException;

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);

    User getByUserName(String username);

}
