package com.example.CRUD.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.hibernate.engine.internal.Cascade;

import java.time.LocalDate;
import java.util.List;

@Table(name = "employees")
@Entity
@Transactional
public class Employee {
    @Id
    private int emp_id;
    private String first_name;
    private String last_name;
    private String email;
    private String department;
    private LocalDate hire_date;


    //Establishing relationships between entities
    @OneToOne(cascade = CascadeType.ALL)//To create foreign key in  table
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
    private List<Projects> projects;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "Employee_skills",
        joinColumns = @JoinColumn(name = "emp_id"),
        inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<Skills>skills;

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        if (address != null) {
            address.setEmployee(this); // Set the employee for the address
        }
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    @Override
    public String toString() {
        return "employee{" +
                "emp_id=" + emp_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", hire_date=" + hire_date +
                '}';
    }

}
