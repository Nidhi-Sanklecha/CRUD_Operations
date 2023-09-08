package com.example.CRUD.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Table(name = "managers")
@Entity
@Transactional
public class Manager {
    @Id
    @Column(name = "manager_id")
    private int manager_id;
    private String Name;

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "manager_id=" + manager_id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
