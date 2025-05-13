package com.xhibit.xhibitbackend.dto.Booth.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateBoothRequestDto {
    @NotNull(message = "Exhibition id cannot be empty")
    private UUID exhibitionId;
    @NotEmpty(message = "Name cannot be empty")
    private String name;
    @NotEmpty(message = "Position cannot be empty")
    private String position;
    @NotNull(message = "Price cannot be null")
    @PositiveOrZero(message = "Price must be positive or zero")
    private double price;
}
