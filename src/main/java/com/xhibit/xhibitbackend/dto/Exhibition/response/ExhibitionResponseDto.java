package com.xhibit.xhibitbackend.dto.Exhibition.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExhibitionResponseDto {
    private UUID id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
}
