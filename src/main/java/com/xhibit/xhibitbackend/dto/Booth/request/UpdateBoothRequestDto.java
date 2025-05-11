package com.xhibit.xhibitbackend.dto.Booth.request;

import com.xhibit.xhibitbackend.entity.BoothStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateBoothRequestDto {
    private String name;
    private String position;
    private double price;
    private BoothStatus status;
}
