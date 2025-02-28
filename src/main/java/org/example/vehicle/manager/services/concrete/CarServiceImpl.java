package org.example.vehicle.manager.services.concrete;

import org.example.vehicle.manager.dao.entity.CarEntity;
import org.example.vehicle.manager.model.enums.CarStatus;
import org.example.vehicle.manager.model.request.CarRequest;
import org.example.vehicle.manager.dao.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.example.vehicle.manager.services.abstraction.CarServices;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarServices {
    private final CarRepository carRepository;

    private CarEntity buildCarEntity(CarRequest carRequest) {
       String  id = (UUID.randomUUID().toString());
         return CarEntity.builder().brand(carRequest.getBrand()).id(id)
                 model(carRequest.getModel()).year(carRequest.getYear()).
                 color(carRequest.getColor()).carStatus(CarStatus.ACTIVE)
                 .plateNumber(carRequest.getPlateNumber())
                 .build();
    };

    @Override
    public void save(CarRequest request) {
        CarEntity carEntity = buildCarEntity(request);
        carRepository.save(carEntity);
    }

    @Override
    public void delete(UUID id) {
         carRepository.deleteById(id);
    }

    @Override
    public CarRequest getById(UUID id) {
        carRepository.findById(id).orElseThrow();
        return null;
    }
}
