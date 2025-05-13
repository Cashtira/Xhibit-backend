package com.xhibit.xhibitbackend.service.impl;

import com.xhibit.xhibitbackend.dto.Booth.request.CreateBoothRequestDto;
import com.xhibit.xhibitbackend.dto.Booth.request.UpdateBoothRequestDto;
import com.xhibit.xhibitbackend.dto.Booth.response.BoothDetailResponseDto;
import com.xhibit.xhibitbackend.dto.Booth.response.BoothResponseDto;
import com.xhibit.xhibitbackend.entity.Booth;
import com.xhibit.xhibitbackend.entity.Exhibition;
import com.xhibit.xhibitbackend.enums.BoothStatus;
import com.xhibit.xhibitbackend.exception.BusinessException;
import com.xhibit.xhibitbackend.repository.BoothRepository;
import com.xhibit.xhibitbackend.repository.ExhibitionRepository;
import com.xhibit.xhibitbackend.service.BoothService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BoothServiceImpl implements BoothService {
    private BoothRepository boothRepository;
    private ExhibitionRepository exhibitionRepository;
    private ModelMapper modelMapper;

    @Override
    public BoothResponseDto createBooth(CreateBoothRequestDto request) {
        if (boothRepository.existsByExhibitionIdAndNameIgnoreCase(request.getExhibitionId(), request.getName()))
        {
            throw new BusinessException("Booth name already exists in the exhibition");
        }

        if (boothRepository.existsByExhibitionIdAndPositionIgnoreCase(request.getExhibitionId(), request.getPosition()))
        {
            throw new BusinessException("Booth position already exists in the exhibition");
        }

        Exhibition exhibition = exhibitionRepository.findById(request.getExhibitionId()).orElseThrow(
                () -> new BusinessException("Exhibition not found")
        );

        Booth booth = Booth.builder()
                .name(request.getName())
                .position(request.getPosition())
                .price(request.getPrice())
                .exhibition(exhibition)
                .status(BoothStatus.Available)
                .build();

        boothRepository.save(booth);

        return modelMapper.map(booth, BoothResponseDto.class);
    }

    @Override
    public BoothDetailResponseDto getBoothById(UUID id) {
        Booth booth = boothRepository.findById(id).orElse(null);
        if (booth == null)
        {
            throw new BusinessException("Booth not found");
        }
        return modelMapper.map(booth, BoothDetailResponseDto.class);
    }

    @Override
    public List<BoothResponseDto> getAllBoothsByExhibitionId(UUID exhibitionId) {
        List<Booth> booths = boothRepository.findAllByExhibitionId(exhibitionId);
        return booths.stream().map(booth -> modelMapper.map(booth, BoothResponseDto.class)).toList();
    }

    @Override
    public List<BoothResponseDto> getAllBoothsByExhibitionIdAndStatus(UUID exhibitionId, BoothStatus status) {
        List<Booth> booths = boothRepository.findByExhibitionIdAndStatus(exhibitionId, status);
        return booths.stream().map(booth -> modelMapper.map(booth, BoothResponseDto.class)).toList();
    }

    @Override
    public BoothResponseDto updateBooth(UUID id, UpdateBoothRequestDto request) {
        Booth booth = boothRepository.findById(id).orElseThrow(() -> new BusinessException("Booth not found"));
        if (!request.getName().isEmpty())
        {
            if (boothRepository.existsByExhibitionIdAndNameIgnoreCase(booth.getExhibition().getId(), request.getName()))
            {
                throw new BusinessException("Booth name already exist in the exhibition");
            }
        }

        if (!request.getPosition().isEmpty())
        {
            if (boothRepository.existsByExhibitionIdAndPositionIgnoreCase(booth.getExhibition().getId(), request.getPosition())) {
                throw new BusinessException("Booth position already exist in the exhibition");
            }
        }

        if (request.getPrice() != null) {
            if (request.getPrice() < 0) {
                throw new BusinessException("The price must be greater or equal to 0");
            }
        }

        modelMapper.map(request, booth);
        boothRepository.save(booth);

        return modelMapper.map(booth, BoothResponseDto.class);
    }

    @Override
    public void deleteBooth(UUID id) {
        if (!boothRepository.existsById(id)) {
            throw new BusinessException("The booth does not exist");
        }
        boothRepository.deleteById(id);
    }
}
