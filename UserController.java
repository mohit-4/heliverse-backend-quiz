package com.heliverse.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class UserController{
	
	@Autowired
	UserService service;
	
	@PostMapping("/post")
	public UserEntity save (@RequestBody UserEntity data) {
	UserEntity save = this.service.save(data);
	return save;
	
	}
	
	@GetMapping("/get")
	public List<UserEntity> getdata(){
		List<UserEntity> getdata2 = this.service.getdata();
		return getdata2;
	
	}

}

