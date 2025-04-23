package com.xhibit.xhibitbackend.service.impl;

import com.xhibit.xhibitbackend.dto.Exhibition.request.CreateExhibitionRequestDto;
import com.xhibit.xhibitbackend.dto.Exhibition.request.UpdateExhibitionRequestDto;
import com.xhibit.xhibitbackend.dto.Exhibition.response.ExhibitionDetailResponseDto;
import com.xhibit.xhibitbackend.dto.Exhibition.response.ExhibitionResponseDto;
import com.xhibit.xhibitbackend.entity.Exhibition;
import com.xhibit.xhibitbackend.exception.BusinessException;
import com.xhibit.xhibitbackend.repository.ExhibitionRepository;
import com.xhibit.xhibitbackend.service.ExhibitionService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ExhibitionServiceImpl implements ExhibitionService {
    private ExhibitionRepository exhibitionRepository;
    private ModelMapper modelMapper;

    @Override
    public ExhibitionDetailResponseDto createExhibition(CreateExhibitionRequestDto request) {
        if(exhibitionRepository.existsByNameIgnoreCase(request.getName())) {
            throw new BusinessException("Exhibition name already exists");
        }

        if(request.getStartDate().isAfter(request.getEndDate())) {
            throw new BusinessException("Start date must be before end date");
        }

        Exhibition exhibition = modelMapper.map(request, Exhibition.class);
        exhibitionRepository.save(exhibition);

        return modelMapper.map(exhibition, ExhibitionDetailResponseDto.class);
    }

    @Override
    public ExhibitionDetailResponseDto getExhibitionById(UUID id) {
        Exhibition exhibition = exhibitionRepository.findById(id).orElse(null);
        if(exhibition == null) {
            throw new BusinessException("Exhibition not found");
        }
        return modelMapper.map(exhibition, ExhibitionDetailResponseDto.class);
    }

    @Override
    public List<ExhibitionResponseDto> getAllExhibitions() {
        List<Exhibition> exhibitions = exhibitionRepository.findAll();
        return exhibitions.stream().map(exhibition -> modelMapper.map(exhibition, ExhibitionResponseDto.class)).toList();
    }

    @Override
    public List<ExhibitionResponseDto> searchExhibitionsByName(String name) {
        List<Exhibition> exhibitions = exhibitionRepository.findAllByNameLikeIgnoreCase(name);
        return exhibitions.stream().map(exhibition -> modelMapper.map(exhibition, ExhibitionResponseDto.class)).toList();
    }

    @Override
    public ExhibitionDetailResponseDto updateExhibition(UUID id, UpdateExhibitionRequestDto request) {
        Exhibition exhibition = exhibitionRepository.findById(id).orElse(null);
        if(exhibition == null) {
            throw new BusinessException("Exhibition not found");
        }

        modelMapper.map(request, exhibition);
        exhibitionRepository.save(exhibition);

        return modelMapper.map(exhibition, ExhibitionDetailResponseDto.class);
    }
}
