package com.xhibit.xhibitbackend.repository;

import com.xhibit.xhibitbackend.entity.Exhibition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

interface ExhibitionRepository extends JpaRepository<Exhibition, UUID> {

}
