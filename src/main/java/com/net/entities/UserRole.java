package com.net.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.net.utils.EnumRole;

@Entity
public class UserRole {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur user;

    @Enumerated(EnumType.STRING)
    private EnumRole role;
}
