package com.gomes.trataerros.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gomes.trataerros.model.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {
    
}
