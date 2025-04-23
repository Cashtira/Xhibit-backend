package com.xhibit.xhibitbackend.dto.Exhibition.request;

import jakarta.validation.constraints.*;
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
    @NotEmpty(message = "Name cannot be empty")
    private String name;
    @NotEmpty(message = "Description cannot be empty")
    private String description;
    @NotEmpty(message = "Location cannot be empty")
    private String location;
    @NotNull(message = "Start date cannot be null")
    @FutureOrPresent(message = "Start date must be in the future or present")
    private LocalDate startDate;
    @NotNull(message = "End date cannot be null")
    @FutureOrPresent(message = "End date must be in the future or present")
    private LocalDate endDate;
}
