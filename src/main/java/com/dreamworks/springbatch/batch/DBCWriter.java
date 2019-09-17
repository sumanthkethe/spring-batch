package com.dreamworks.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dreamworks.springbatch.model.User;
import com.dreamworks.springbatch.repository.UserRepository;

@Component
public class DBCWriter implements ItemWriter<User>{
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> users) throws Exception {
		
		System.out.println("Data saved for Users");
		userRepository.saveAll(users);
		
	}
}
