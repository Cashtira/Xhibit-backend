package com.xhibit.xhibitbackend.service;

import com.xhibit.xhibitbackend.dto.Exhibition.request.CreateExhibitionRequestDto;
import com.xhibit.xhibitbackend.dto.Exhibition.request.UpdateExhibitionRequestDto;
import com.xhibit.xhibitbackend.dto.Exhibition.response.ExhibitionResponseDto;
import com.xhibit.xhibitbackend.entity.Exhibition;

import java.util.List;
import java.util.UUID;

public interface ExhibitionService {
    Exhibition createExhibition(CreateExhibitionRequestDto request);
    Exhibition getExhibitionById(UUID id);
    List<ExhibitionResponseDto> getAllExhibitions();
    List<ExhibitionResponseDto> searchExhibitionsByName(String name);
    Exhibition updateExhibition(UUID id, UpdateExhibitionRequestDto request);
}
