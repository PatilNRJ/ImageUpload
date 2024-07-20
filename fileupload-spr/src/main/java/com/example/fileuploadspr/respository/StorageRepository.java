package com.example.fileuploadspr.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fileuploadspr.entity.ImageData;

public interface StorageRepository extends JpaRepository<ImageData,Long> {

    Optional<ImageData> findByName(String fileName);
}