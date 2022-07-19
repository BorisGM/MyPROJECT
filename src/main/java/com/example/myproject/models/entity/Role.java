package com.example.myproject.models.entity;


import com.example.myproject.models.enums.UserRoleEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity{
    @Enumerated(value = EnumType.STRING)
    private UserRoleEnum name;

    public Role() {
    }

    public UserRoleEnum getName() {
        return name;
    }

    public Role setName(UserRoleEnum name) {
        this.name = name;
        return this;
    }
}
