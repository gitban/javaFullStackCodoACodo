package com.consultorio.dramado.obrassociales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ObrasSocialesRepository extends JpaRepository<ObrasSociales, Long> {
    Optional<ObrasSociales> findByNombre(String nombre);
}
