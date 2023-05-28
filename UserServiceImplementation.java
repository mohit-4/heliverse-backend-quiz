package com.heliverse.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	UserRepository repository;

	@Override
	public UserEntity save(UserEntity data) {
	UserEntity save = this.repository.save(data);
	return save;
	}

	@Override
	public List<UserEntity> getdata() {
	List<UserEntity> findAll = this.repository.findAll();
	return findAll;
	}
	
}
