package com.infosys.cloudmonitoring.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "assets")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type; // SERVER, DATABASE, NETWORK

    @Column(nullable = false)
    private String status; // HEALTHY, WARNING, CRITICAL

    private LocalDateTime lastCheckedAt;
}