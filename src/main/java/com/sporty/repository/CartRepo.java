package com.sporty.repository;

import org.springframework.data.repository.CrudRepository;

import com.sporty.entity.CartEntity;

public interface CartRepo extends CrudRepository<CartEntity, Integer>{

}
