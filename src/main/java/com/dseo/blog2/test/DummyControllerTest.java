package com.dseo.blog2.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {
	
	// http://localhost:8000/blog/dummy/join
	@PostMapping("/dummy/join")
	public String join(@RequestParam("username") String u, String password, String email) {
		System.out.println("username : " + u);
		return "회원 가입이 완료되었습니다.";
	}
}
