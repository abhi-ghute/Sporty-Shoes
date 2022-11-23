package com.sporty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sporty.entity.AddShoesEntity;

public interface ShoesInf extends CrudRepository<AddShoesEntity, Integer> {

	@Query(value = "select s from AddShoesEntity s where name in (select c.shooetype from CartEntity c where email=?1)")
	public List<AddShoesEntity> getCartItems(String email);
	
	@Query(value = "select * from add_shoes_entity s inner join cart_entity c on s.name = c.shooetype where c.date between :from and :to and s.shoes_type =:type",nativeQuery = true)
	public List<AddShoesEntity> getReport(@Param("from") String from, @Param("to") String to, @Param("type") String type);
}
