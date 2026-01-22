package com.example.orderflow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name= "stores")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public  class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String address;

    @Column(name = "open_hour")
    private LocalDateTime openHour;

    @Column(name = "closing_hour")
    private LocalDateTime closeHour;

}
