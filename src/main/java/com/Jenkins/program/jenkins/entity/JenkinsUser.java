package com.Jenkins.program.jenkins.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JenkinsUser {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
    private String name;
}
