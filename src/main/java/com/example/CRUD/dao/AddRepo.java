package com.example.CRUD.dao;

import com.example.CRUD.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddRepo extends CrudRepository<Address,Integer> {
}
