package com.dev.demojulio.repository;

import com.dev.demojulio.entity.ColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ColorRepository extends JpaRepository<ColorEntity, UUID> {

    ColorEntity findByName(String name);

}
