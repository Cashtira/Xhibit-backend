package com.xhibit.xhibitbackend.service.impl;

import com.xhibit.xhibitbackend.dto.Exhibition.request.CreateExhibitionRequestDto;
import com.xhibit.xhibitbackend.dto.Exhibition.request.UpdateExhibitionRequestDto;
import com.xhibit.xhibitbackend.dto.Exhibition.response.ExhibitionResponseDto;
import com.xhibit.xhibitbackend.entity.Exhibition;
import com.xhibit.xhibitbackend.service.ExhibitionService;

import java.util.List;
import java.util.UUID;

public class ExhibitionServiceImpl implements ExhibitionService {
    @Override
    public Exhibition createExhibition(CreateExhibitionRequestDto request) {

        return null;
    }

    @Override
    public Exhibition getExhibitionById(UUID id) {
        return null;
    }

    @Override
    public List<ExhibitionResponseDto> getAllExhibitions() {
        return List.of();
    }

    @Override
    public List<ExhibitionResponseDto> searchExhibitionsByName(String name) {
        return List.of();
    }

    @Override
    public Exhibition updateExhibition(UUID id, UpdateExhibitionRequestDto request) {
        return null;
    }
}
