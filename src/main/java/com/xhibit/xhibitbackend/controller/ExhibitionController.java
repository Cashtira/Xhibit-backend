package com.xhibit.xhibitbackend.controller;

import com.xhibit.xhibitbackend.dto.Exhibition.request.CreateExhibitionRequestDto;
import com.xhibit.xhibitbackend.dto.Exhibition.request.UpdateExhibitionRequestDto;
import com.xhibit.xhibitbackend.dto.Exhibition.response.ExhibitionDetailResponseDto;
import com.xhibit.xhibitbackend.dto.Exhibition.response.ExhibitionResponseDto;
import com.xhibit.xhibitbackend.service.ExhibitionService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/exhibitions")
@AllArgsConstructor
public class ExhibitionController {
    private ExhibitionService exhibitionService;
    @PostMapping
    @Operation(summary = "Create a new exhibition")
    public ResponseEntity<ExhibitionDetailResponseDto> createExhibition(@RequestBody @Valid CreateExhibitionRequestDto request) {
        return ResponseEntity.ok(exhibitionService.createExhibition(request));
    }
    @GetMapping("/{id}")
    @Operation(summary = "Get an exhibition by id")
    public ResponseEntity<ExhibitionDetailResponseDto> getExhibitionById(@PathVariable UUID id) {
        return ResponseEntity.ok(exhibitionService.getExhibitionById(id));
    }
    @GetMapping
    @Operation(summary = "Get all exhibitions")
    public ResponseEntity<List<ExhibitionResponseDto>> getAllExhibitions() {
        return ResponseEntity.ok(exhibitionService.getAllExhibitions());
    }
    @GetMapping("/search")
    @Operation(summary = "Search exhibitions by name")
    public ResponseEntity<List<ExhibitionResponseDto>> searchExhibitionsByName(@RequestParam String name) {
        return ResponseEntity.ok(exhibitionService.searchExhibitionsByName(name));
    }
    @PatchMapping("/{id}")
    @Operation(summary = "Update an exhibition by id")
    public ResponseEntity<ExhibitionDetailResponseDto> updateExhibition(@PathVariable UUID id, @RequestBody @Valid UpdateExhibitionRequestDto request) {
        return ResponseEntity.ok(exhibitionService.updateExhibition(id, request));
    }
}
