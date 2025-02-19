package com.mimi.Dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mimi.Dto.Store;

public interface StoreDao extends MongoRepository<Store, Integer> {
	public Page<Store> findAll(Pageable pageable);
}
