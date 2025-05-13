package com.xhibit.xhibitbackend.controller;

import com.xhibit.xhibitbackend.dto.Booth.request.CreateBoothRequestDto;
import com.xhibit.xhibitbackend.dto.Booth.request.UpdateBoothRequestDto;
import com.xhibit.xhibitbackend.dto.Booth.response.BoothDetailResponseDto;
import com.xhibit.xhibitbackend.dto.Booth.response.BoothResponseDto;
import com.xhibit.xhibitbackend.enums.BoothStatus;
import com.xhibit.xhibitbackend.service.BoothService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/booths")
@AllArgsConstructor
public class BoothController {
    private BoothService boothService;

    @PostMapping
    @Operation(summary = "Create a new booth")
    public ResponseEntity<BoothResponseDto> createBooth(@Valid @RequestBody CreateBoothRequestDto request) {
        return ResponseEntity.ok(boothService.createBooth(request));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a booth by id")
    public ResponseEntity<BoothDetailResponseDto> getBoothById(@PathVariable UUID id) {
        return ResponseEntity.ok(boothService.getBoothById(id));
    }

    @GetMapping("/exhibitions/{exhibitionId}")
    @Operation(summary = "Get all booths")
    public ResponseEntity<List<BoothResponseDto>> getAllBoothsByExhibitionId(@PathVariable UUID exhibitionId) {
        return ResponseEntity.ok(boothService.getAllBoothsByExhibitionId(exhibitionId));
    }

    @GetMapping("/exhibitions/{exhibitionId}/status")
    @Operation(summary = "Get all booths by status")
    public ResponseEntity<List<BoothResponseDto>> getAllBoothsByExhibitionIdAndStatus(@PathVariable UUID exhibitionId, @RequestParam BoothStatus status) {
        return ResponseEntity.ok(boothService.getAllBoothsByExhibitionIdAndStatus(exhibitionId, status));
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Update a booth by id")
    public ResponseEntity<BoothResponseDto> updateBooth(@PathVariable UUID id, @Valid @RequestBody UpdateBoothRequestDto request) {
        return ResponseEntity.ok(boothService.updateBooth(id, request));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a booth by id")
    public ResponseEntity<Void> deleteBooth(@PathVariable UUID id) {
        boothService.deleteBooth(id);
        return ResponseEntity.noContent().build(); // 204 No Content
    }

}
