package com.sporty.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sporty.entity.UserEntity;

@Repository
public interface UserInf extends CrudRepository<UserEntity, Integer>{

}
