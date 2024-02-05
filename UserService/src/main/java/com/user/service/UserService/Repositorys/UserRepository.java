package com.user.service.UserService.Repositorys;

import com.user.service.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    //if you want to implement any custom method or query
    //write
}
