package com.schooldost.gateway.user;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooldost.gateway.mongodb.model.Role;
import com.schooldost.gateway.mongodb.model.User;
import com.schooldost.gateway.repository.ClassDetailsRepository;
import com.schooldost.gateway.repository.RoleRepository;
import com.schooldost.gateway.repository.UserRepository;
import com.schooldost.service.mongodb.model.ClassDetails;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ClassDetailsRepository classDetailsRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	public User create(User user) {
		user.setDomainId(UUID.randomUUID().toString());
		user.getRole().setDomainId(UUID.randomUUID().toString());
		
		// We must save both separately since there is no cascading feature
		// in Spring Data MongoDB (for now)
		roleRepository.save(user.getRole());
		return userRepository.save(user);
	}
	
	public User findByUsername(String username) {
		return userRepository.findByUsername( username);
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User findByMobileNumber(String mobileNumber) {
		return userRepository.findByMobileNumber(mobileNumber);
	}
	
	public User read(User user) {
		return user;
	}
	
	public List<User> readAll() {
		return userRepository.findAll();
	}
	
	public User update(User user) {
		User existingUser = userRepository.findByUsername(user.getUsername());
		
		if (existingUser == null) {
			return null;
		}
		
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.getRole().setRole(user.getRole().getRole());
		
		// We must save both separately since there is no cascading feature
		// in Spring Data MongoDB (for now)
		roleRepository.save(existingUser.getRole());
		return userRepository.save(existingUser);
	}
	
	public Boolean delete(User user) {
		User existingUser = userRepository.findByUsername(user.getUsername());
		
		if (existingUser == null) {
			return false;
		}
		
		// We must delete both separately since there is no cascading feature
		// in Spring Data MongoDB (for now)
		roleRepository.delete(existingUser.getRole());
		userRepository.delete(existingUser);
		return true;
	}

	public Role createRole(Role role) {
		role.setDomainId(UUID.randomUUID().toString());
		return roleRepository.save(role);
	}
	
	public ClassDetails createClass(ClassDetails classDetails) {
		System.out.println("createClass :: classDetails :: " + classDetails);
		return classDetailsRepository.save(classDetails);
	}
}
