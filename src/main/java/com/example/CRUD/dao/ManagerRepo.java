package com.example.CRUD.dao;

import com.example.CRUD.model.Manager;
import org.springframework.data.repository.CrudRepository;

public interface ManagerRepo extends CrudRepository<Manager,Integer> {
}
