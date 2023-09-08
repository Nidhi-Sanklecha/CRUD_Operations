package com.example.CRUD.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Table(name = "projects")
@Entity
@Transactional
public class Projects {
    @Id
    @Column(name = "project_id")
    private int project_id;
    private String Name;

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "project_id=" + project_id +
                ", Name='" + Name + '\'' +
                '}';
    }
}

