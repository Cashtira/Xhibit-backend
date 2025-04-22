package com.xhibit.xhibitbackend.dto.Exhibition.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateExhibitionRequestDto {
    private String name;
    private String description;
    private String location;
    private LocalDate startDate;
    private LocalDate endDate;
}
