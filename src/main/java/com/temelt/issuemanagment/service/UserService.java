package com.temelt.issuemanagment.service;

import com.temelt.issuemanagment.dto.UserDto;
import com.temelt.issuemanagment.util.TPage;
import org.springframework.data.domain.Pageable;

public interface UserService {

    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);

}
