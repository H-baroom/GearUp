package com.example.capston3.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MaintenanceExpertDTO {private String name;

    private String username;

    private String email;

    private String specialty;

    private Boolean isApproved;

    private Integer yearsOfExperience;

    private String description;
}
