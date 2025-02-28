package org.example.vehicle.manager.dao.repository;

import org.example.vehicle.manager.dao.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarRepository extends JpaRepository<CarEntity, String> {
}
