package org.example.vehicle.manager.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarRequest {
    private String brand;
    private String model;
    private String color;
    private Integer year;
    private String plateNumber;
}
