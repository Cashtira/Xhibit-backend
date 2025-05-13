package com.xhibit.xhibitbackend.dto.Booth.request;

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
    private Double price;
}
