package com.dseo.blog2.service;

import com.dseo.blog2.model.User;
import com.dseo.blog2.repository.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// 스프링이 컴포넌트 스캔을 통해서 Bean에 등록, IoC를 해줌
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // 이것을 사용하면 아래 함수 내부는 자동으로 Transaction 처리를 한다. (함수가 끝날때 commit)
    @Transactional
    public void signup(User user) {
        try {
            userRepository.save(user);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("UserService 회원가입() : " + e.getMessage());
        }
    }
    @Transactional
    public User login(User user) {
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }
}
