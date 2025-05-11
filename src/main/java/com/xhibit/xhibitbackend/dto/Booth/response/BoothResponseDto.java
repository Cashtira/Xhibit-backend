package com.xhibit.xhibitbackend.dto.Booth.response;

import com.xhibit.xhibitbackend.entity.BoothStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BoothResponseDto {
    private String name;
    private String position;
    private double price;
    private BoothStatus status;
}
