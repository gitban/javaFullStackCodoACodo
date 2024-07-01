package com.consultorio.dramado.turnos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class TurnosService {

    HashMap<String,Object> datos;

    private final TurnosRepository turnosRepository;

    @Autowired
    public TurnosService(TurnosRepository turnosRepository) {
        this.turnosRepository = turnosRepository;
    }

    public List<Turnos> getTurnos() {
        return this.turnosRepository.findAll();
    }

    public Object getTurno(Integer idturno) {
        return this.turnosRepository.findByIdTurno(idturno);
    }

    public Object getTurnoLibre(Boolean asignado) {
        return this.turnosRepository.findByAsignado(asignado);
    }

    public ResponseEntity<Object> newTurno(Turnos turno) {

        Optional<Turnos> resp = turnosRepository.findByIdTurno(turno.getIdturno());
        datos = new HashMap<>();

        if (resp.isPresent() && turno.getIdturno()==null) {
            datos.put("error", true);
            datos.put("message","El DNI de turno ya existe");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
                    );
        }
        datos.put("message", "El turno se ha registrado correctamente");
        if(turno.getIdturno()!=null){
            datos.put("message", "El turno se ha actualizado correctamente");
        }
        turnosRepository.save(turno);
        datos.put("data",turno);
        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
    }

    public ResponseEntity<Object> deleteTurno(Long id) {
        boolean existe = this.turnosRepository.existsById(id);
        datos = new HashMap<>();
        if(!existe) {
            datos.put("error", true);
            datos.put("message","No existe el turno con el id seleccionado");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        turnosRepository.deleteById(id);
        datos.put("message","El turno fue eliminado correctamente");
        return new ResponseEntity<>(
                datos,
                HttpStatus.ACCEPTED
        );
    }
}
