package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;



public enum Role{

    ROLE_USER, ROLE_ADMIN;

}

