package com.heliverse.quiz;

import java.util.List;

public interface UserService {
	
	public UserEntity save (UserEntity data);
	
	public List<UserEntity> getdata();

}
