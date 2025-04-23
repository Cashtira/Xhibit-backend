package com.xhibit.xhibitbackend.service;

import com.xhibit.xhibitbackend.dto.Exhibition.request.CreateExhibitionRequestDto;
import com.xhibit.xhibitbackend.dto.Exhibition.request.UpdateExhibitionRequestDto;
import com.xhibit.xhibitbackend.dto.Exhibition.response.ExhibitionDetailResponseDto;
import com.xhibit.xhibitbackend.dto.Exhibition.response.ExhibitionResponseDto;

import java.util.List;
import java.util.UUID;

public interface ExhibitionService {
    ExhibitionDetailResponseDto createExhibition(CreateExhibitionRequestDto request);
    ExhibitionDetailResponseDto getExhibitionById(UUID id);
    List<ExhibitionResponseDto> getAllExhibitions();
    List<ExhibitionResponseDto> searchExhibitionsByName(String name);
    ExhibitionDetailResponseDto updateExhibition(UUID id, UpdateExhibitionRequestDto request);
}
