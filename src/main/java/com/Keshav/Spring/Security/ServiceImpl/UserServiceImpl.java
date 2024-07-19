package com.Keshav.Spring.Security.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.Keshav.Spring.Security.Entity.User;
import com.Keshav.Spring.Security.Service.UserService;
@Service
public class UserServiceImpl implements UserService{

		List<User>users=new ArrayList<User>();
		
		public UserServiceImpl() {
			users.add(new User(UUID.randomUUID().toString(),"Keshav","guptakeshav885@gmail.com"));
			users.add(new User(UUID.randomUUID().toString(),"Aakash","AakashGupta78@gmail.com"));
			users.add(new User(UUID.randomUUID().toString(),"Yash","YashSingh56@gmail.com"));
		}
		@Override
		public List<User> getUsers(){
			return this.users;
		}
		
}
