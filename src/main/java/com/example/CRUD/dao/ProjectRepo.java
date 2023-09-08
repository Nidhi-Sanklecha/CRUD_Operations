package com.example.CRUD.dao;

import com.example.CRUD.model.Projects;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepo extends CrudRepository<Projects,Integer> {
}
