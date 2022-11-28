package com.dseo.blog2.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {
	
	private static final String TAG = "HTTPControllerTest : ";
	@GetMapping("/http/lomboktest")
	public Member testLombokTest() {
		Member m1 = Member.builder().username("Korean").email("sdlkjf@sdlkjf.com").build();
		System.out.println(TAG + "getter : " + m1.getUsername());
		m1.setUsername("English");
		m1.setEmail("dslkfj@sldkfj.com");
		System.out.println(TAG + "getter : " + m1.getUsername());
		System.out.println(TAG + "getter : " + m1.getEmail());
		return m1;
	}
	// http://localhost:8080/http/get
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청" + m.getId();
	}
	
	// http://localhost:8080/http/post
	@PostMapping("/http/post")
	public String postTest(Member m) {
		return "post 요청" + m.getId();
	}
	
	// http://localhost:8080/http/put
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	} 
	
	// http://localhost:8080/http/delete
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	
	
}
