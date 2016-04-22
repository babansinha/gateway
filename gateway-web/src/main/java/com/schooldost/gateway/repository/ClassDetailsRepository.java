package com.schooldost.gateway.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.schooldost.service.mongodb.model.ClassDetails;

public interface ClassDetailsRepository extends MongoRepository<ClassDetails, String> {


}
