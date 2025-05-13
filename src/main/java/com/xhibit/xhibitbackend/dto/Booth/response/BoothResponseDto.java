package com.xhibit.xhibitbackend.dto.Booth.response;

import com.xhibit.xhibitbackend.enums.BoothStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BoothResponseDto {
    private UUID id;
    private String name;
    private String position;
    private double price;
    private BoothStatus status;
}
