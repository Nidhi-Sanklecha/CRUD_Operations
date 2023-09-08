package com.example.CRUD.dao;

import com.example.CRUD.model.Skills;
import org.springframework.data.repository.CrudRepository;

public interface SkillRepo extends CrudRepository<Skills,Long> {
}
