package com.example.demo;

import com.example.mapper.userMapper;
import com.example.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private userMapper userMapper;
	@Test
	void contextLoads() {
		List<user> users = userMapper.selectList(null);
		users.forEach(System.out::println);


	}

}
