package com.monthly;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserItemController {
	
	@Autowired
	private UserItemRepository userItemRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/bill/{userId}")
	public void getBill(@PathVariable String userId) {
		System.out.println("userId = "+userId);
		User user = userRepository.findByName(userId);
		List<UserItem> userItems = userItemRepository.findByUser(user);
		System.out.println("userItems = "+userItems);
	}

}
