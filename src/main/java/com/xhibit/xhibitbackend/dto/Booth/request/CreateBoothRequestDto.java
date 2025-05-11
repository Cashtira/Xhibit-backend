package com.xhibit.xhibitbackend.dto.Booth.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateBoothRequestDto {
    @NotEmpty(message = "Name cannot be empty")
    private String name;
    @NotEmpty(message = "Position cannot be empty")
    private String position;
    @NotEmpty(message = "Price cannot be empty")
    private double price;
}
