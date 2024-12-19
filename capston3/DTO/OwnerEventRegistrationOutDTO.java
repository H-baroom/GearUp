package com.example.capston3.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OwnerEventRegistrationOutDTO {

    private String status;

    private Integer event_id;

    private Integer owner_id;

    private Integer motorcycle_id;
}
