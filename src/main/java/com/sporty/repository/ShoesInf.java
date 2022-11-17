package com.sporty.repository;

import org.springframework.data.repository.CrudRepository;

import com.sporty.entity.AddShoesEntity;

public interface ShoesInf extends CrudRepository<AddShoesEntity, Integer> {

}
