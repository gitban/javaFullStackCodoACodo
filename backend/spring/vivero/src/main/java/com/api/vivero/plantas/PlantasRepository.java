package com.api.vivero.plantas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlantasRepository extends JpaRepository<Plantas, Long> {
    Optional<Plantas> findById(Integer id);
}
