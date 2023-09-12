package com.example.CRUD.controller;

import com.example.CRUD.dao.EmpRepo;
import com.example.CRUD.model.Employee;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@OpenAPIDefinition(
        info = @Info(
                title="APIs",
                version = "2.0.0",
                description = "APIs for CRUD operation on employees",
                contact = @Contact(
                        name = "Nidhi",
                        email = "int.Nidhi.Sanklecha@xpressbees.com"
                )
        )
)
public class EmpController {
    @Autowired
    private EmpRepo emp;

    @PostMapping("/addEmployee")
    public String CreateEmp(@RequestBody Employee existing_emp)
    {
        emp.save(existing_emp);
        return "Added successfully";
    }

    @GetMapping("/findAllEmployees")
    public Iterable<Employee> getEmployees()
    {
        return emp.findAll();
    }
    @PutMapping("/putEmployee")
    public String UpdateEmp(@RequestBody Employee existing_emp)
    {
        emp.save(existing_emp);
        return "Updated the Employee credentials";
    }

    @DeleteMapping("/delete/{emp_id}")
    public String deleteEmp(@PathVariable int emp_id)
    {
        emp.deleteById(emp_id);
        return "Deleted successfully";
    }



}
