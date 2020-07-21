package com.myspring.dashboard.repository;


import com.myspring.dashboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
