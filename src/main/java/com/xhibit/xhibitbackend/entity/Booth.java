package com.xhibit.xhibitbackend.entity;

import com.xhibit.xhibitbackend.enums.BoothStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "booths")
public class Booth {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exhibition_id", nullable = false)
    private Exhibition exhibition;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "position", nullable = false)
    private String position;
    @Column(name = "price", nullable = false)
    private double price;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BoothStatus status;
}
