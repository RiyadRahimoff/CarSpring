package org.example.vehicle.manager.services.abstraction;

import org.example.vehicle.manager.model.request.CarRequest;

import java.util.UUID;


public interface CarServices {
     void save(CarRequest request );
     void delete(UUID id);
     CarRequest getById(UUID id);
}
