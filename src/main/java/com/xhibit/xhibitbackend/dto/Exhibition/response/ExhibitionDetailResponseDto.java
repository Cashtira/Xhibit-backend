package com.xhibit.xhibitbackend.dto.Exhibition.response;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExhibitionDetailResponseDto {
    private UUID id;
    private String name;
    private String description;
    private String location;
    private String startDate;
    private String endDate;
}
