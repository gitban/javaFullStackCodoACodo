package com.consultorio.dramado.turnos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TurnosRepository extends JpaRepository<Turnos, Long> {
    Optional<Turnos> findByIdTurno(Integer idturno);
    Optional<Turnos> findByAsignado(Boolean asignado);
}
