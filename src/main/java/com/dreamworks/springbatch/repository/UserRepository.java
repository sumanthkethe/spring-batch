package com.dreamworks.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamworks.springbatch.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
