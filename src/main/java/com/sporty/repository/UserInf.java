package com.sporty.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sporty.entity.UserEntity;

@Repository
public interface UserInf extends CrudRepository<UserEntity, Integer>{

	public List<UserEntity> findByEmailAndPassword(String email,String password);
}
