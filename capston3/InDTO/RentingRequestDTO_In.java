package com.example.capston3.InDTO;


import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class RentingRequestDTO_In {

   @FutureOrPresent(message = "Start date must be in the present or future")
    private LocalDate startDate;

   @Future(message = "End date must be in the future")
    private LocalDate endDate;

    private Integer motorcycleId ;


}
