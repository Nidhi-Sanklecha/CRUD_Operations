package com.example.CRUD.dao;
import com.example.CRUD.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<Employee,Integer> {
}
