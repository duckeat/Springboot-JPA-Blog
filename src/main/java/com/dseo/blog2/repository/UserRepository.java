package com.dseo.blog2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dseo.blog2.model.User;
public interface UserRepository extends JpaRepository<User, Integer>{

}
