package com.example.capston3.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class MaintenanceRequestDTO {
    private LocalDate requestDate;

    private Double totalPrice;

    private String expertName;

    private String status;

    private LocalDate pickupDate;

    private MotorcycleDTO motorcycleS;



    public MaintenanceRequestDTO(LocalDate requestDate, Double totalPrice, String expertName,
                                 @Pattern(regexp = "^(Pending|Completed)$") @NotEmpty(message = "varchar(10)") String status,
                                 LocalDate pickupDate, MotorcycleDTO motorcycleDTO) {
        this.requestDate = requestDate;
        this.totalPrice = totalPrice;
        this.expertName = expertName;
        this.status = status;
        this.pickupDate = pickupDate;
        this.motorcycleS = motorcycleDTO;
    }
}
