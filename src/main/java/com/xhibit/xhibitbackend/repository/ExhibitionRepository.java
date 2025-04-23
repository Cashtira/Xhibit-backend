package com.xhibit.xhibitbackend.repository;

import com.xhibit.xhibitbackend.entity.Exhibition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ExhibitionRepository extends JpaRepository<Exhibition, UUID> {
    boolean existsByNameIgnoreCase(String name);
    List<Exhibition> findAllByNameLikeIgnoreCase(String name);
}
