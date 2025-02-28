package org.example.vehicle.manager.controller;

import org.example.vehicle.manager.model.request.CarRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.example.vehicle.manager.services.abstraction.CarServices;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1/cars")
public class CarController {
    private final CarServices carServices;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody CarRequest request) {
        carServices.save(request);
    }
    @GetMapping("/{id}")
    public CarRequest getById(@PathVariable UUID id) {
        return carServices.getById(id);
    }

}
