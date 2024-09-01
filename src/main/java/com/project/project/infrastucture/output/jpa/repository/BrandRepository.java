package com.project.project.infrastucture.output.jpa.repository;

import com.project.project.domain.model.Brand;
import com.project.project.infrastucture.output.jpa.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity,Long> {
    Optional<Brand> findByName(String name);
}
