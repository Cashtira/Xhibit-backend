package com.xhibit.xhibitbackend.repository;

import com.xhibit.xhibitbackend.entity.Booth;
import com.xhibit.xhibitbackend.entity.BoothStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BoothRepository extends JpaRepository<Booth, UUID> {
    boolean existsByExhibitionIdAndNameIgnoreCase(UUID exhibitionId, String name);
    List<Booth> findAllByExhibitionId(UUID exhibitionId);
    List<Booth> findByExhibitionIdAndStatus(UUID exhibitionId, BoothStatus status);
}
