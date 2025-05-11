package com.xhibit.xhibitbackend.service;

import com.xhibit.xhibitbackend.dto.Booth.request.CreateBoothRequestDto;
import com.xhibit.xhibitbackend.dto.Booth.request.UpdateBoothRequestDto;
import com.xhibit.xhibitbackend.dto.Booth.response.BoothDetailResponseDto;
import com.xhibit.xhibitbackend.dto.Booth.response.BoothResponseDto;

import java.util.List;

public interface BoothService {
    BoothDetailResponseDto createBooth(CreateBoothRequestDto request);
    BoothDetailResponseDto getBoothById(String id);
    List<BoothResponseDto> getAllBoothsbyExhibitionId(String exhibitionId);
    List<BoothResponseDto> getAllBoothsByExhibitionIdAndStatus(String exhibitionId, String status);
    BoothDetailResponseDto updateBooth(String id, UpdateBoothRequestDto request);
    void deleteBooth(String id);
}
