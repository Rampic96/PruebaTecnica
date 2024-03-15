package com.example.rest.favoritos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "launch")
public class Launch {

    @Id
    private String launchId;
    private String provider;

    public Launch() {
    }
}
