package org.example.vehicle.manager.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.vehicle.manager.model.enums.CarStatus;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cars")

public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String brand;
    private String model;
    private String color;
    private Integer year;
    private String plateNumber;

    @Enumerated(EnumType.STRING)
    private CarStatus carStatus;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
