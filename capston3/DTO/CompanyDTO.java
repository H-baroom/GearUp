package com.example.capston3.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CompanyDTO {
    private String name;
    private String email;
    private String contactInfo;
    private Boolean isApproved;

}
