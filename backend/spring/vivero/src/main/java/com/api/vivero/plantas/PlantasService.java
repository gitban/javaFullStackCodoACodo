package com.api.vivero.plantas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class PlantasService {
    HashMap<String,Object> datos;

    private final PlantasRepository plantasRepository;

    @Autowired
    public PlantasService(PlantasRepository plantasRepository) {
        this.plantasRepository = plantasRepository;
    }

    public List<Plantas> getPlantas() {
        return this.plantasRepository.findAll();
    }

    public Object getPlanta(Integer id) {
        return this.plantasRepository.findById(id);
    }

    public ResponseEntity<Object> newPlanta(Plantas planta) {

        Optional<Plantas> resp = plantasRepository.findById(planta.getId());
        datos = new HashMap<>();

        if (resp.isPresent() && planta.getId()==null) {
            datos.put("error", true);
            datos.put("message","El DNI de planta ya existe");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        datos.put("message", "El planta se ha registrado correctamente");
        if(planta.getId()!=null){
            datos.put("message", "El planta se ha actualizado correctamente");
        }
        plantasRepository.save(planta);
        datos.put("data",planta);
        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
    }

    public ResponseEntity<Object> deletePlanta(Long id) {
        boolean existe = this.plantasRepository.existsById(id);
        datos = new HashMap<>();
        if(!existe) {
            datos.put("error", true);
            datos.put("message","No existe el planta con el id seleccionado");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        plantasRepository.deleteById(id);
        datos.put("message","El planta fue eliminado correctamente");
        return new ResponseEntity<>(
                datos,
                HttpStatus.ACCEPTED
        );
    }
}
