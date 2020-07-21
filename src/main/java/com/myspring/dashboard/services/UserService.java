package com.myspring.dashboard.services;

import com.myspring.dashboard.entity.User;

public interface UserService {
    String getAllUsers();

    User getUser(Long id);

    Integer addUser(User user);

    int deleteUser(Long id);

    int updateUser(User user);

}
