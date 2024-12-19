package com.example.capston3.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class EventDTO {
    private String name;

    private String location;

    private String details;

    private LocalDate date;
}
