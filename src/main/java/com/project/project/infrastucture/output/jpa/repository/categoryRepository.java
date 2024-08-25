package com.project.project.infrastucture.output.jpa.repository;

import com.project.project.domain.model.category;
import com.project.project.infrastucture.output.jpa.entity.categoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface categoryRepository extends JpaRepository<categoryEntity, Long> {
    Optional<category> findByName(String name);

}
