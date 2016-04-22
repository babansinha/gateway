package com.schooldost.gateway.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.schooldost.gateway.mongodb.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByUsername(String username);

	User findByEmail(String email);

	User findByMobileNumber(String mobileNumber);

}
