package com.dseo.blog2.controller.api;

import com.dseo.blog2.dto.ResponseDto;
import com.dseo.blog2.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @PostMapping("/api/user")
    public ResponseDto<Integer> save(@RequestBody User user) {
        System.out.println("UserApiController : save 호출");
        // 실제로 DB에 insert를 하고 아래에서 return이 되면 되요.
        return new ResponseDto<Integer>(HttpStatus.OK, 1);
    }
}
