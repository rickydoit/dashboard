package com.myspring.dashboard.services;

import com.myspring.dashboard.pojo.User;

public interface UserService {
    String getAllUsers();

    User getUser(Long id);

    int addUser(User user);

    int deleteUser(Long id);

    int updateUser(User user);

}
