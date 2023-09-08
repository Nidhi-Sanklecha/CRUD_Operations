package com.example.CRUD.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Table(name = "address")
@Entity
@Transactional
public class Address {
    @Id
    @Column(name = "add_id")
    private int add_id;
    private String City;
    private String address_type;

    @OneToOne(mappedBy = "address")
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getadd_id() {
        return add_id;
    }

    public void setadd_id(int add_id) {
        this.add_id = add_id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getaddress_type() {
        return address_type;
    }

    public void setaddress_type(String address_type) {
        this.address_type = address_type;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + add_id +
                ", City='" + City + '\'' +
                ", addressType='" + address_type + '\'' +
                '}';
    }
}
