package com.example.CRUD.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

import java.util.List;

@Table(name = "skills")
@Entity
@Transactional
public class Skills {
    @Id
    @Column(name = "skill_id")
    private int skill_id;
    private String Name;

    @ManyToMany(mappedBy = "skills")
    private List<Employee> employees;

    public int getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "skill_id=" + skill_id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
