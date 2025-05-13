package com.xhibit.xhibitbackend.service;

import com.xhibit.xhibitbackend.dto.Booth.request.CreateBoothRequestDto;
import com.xhibit.xhibitbackend.dto.Booth.request.UpdateBoothRequestDto;
import com.xhibit.xhibitbackend.dto.Booth.response.BoothDetailResponseDto;
import com.xhibit.xhibitbackend.dto.Booth.response.BoothResponseDto;
import com.xhibit.xhibitbackend.enums.BoothStatus;

import java.util.List;
import java.util.UUID;

public interface BoothService {
    BoothResponseDto createBooth(CreateBoothRequestDto request);
    BoothDetailResponseDto getBoothById(UUID id);
    List<BoothResponseDto> getAllBoothsByExhibitionId(UUID exhibitionId);
    List<BoothResponseDto> getAllBoothsByExhibitionIdAndStatus(UUID exhibitionId, BoothStatus status);
    BoothResponseDto updateBooth(UUID id, UpdateBoothRequestDto request);
    void deleteBooth(UUID id);
}
