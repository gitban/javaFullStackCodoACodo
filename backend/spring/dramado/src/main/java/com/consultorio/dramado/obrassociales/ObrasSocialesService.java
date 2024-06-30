package com.consultorio.dramado.obrassociales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class ObrasSocialesService {

    HashMap<String,Object> datos;

    private final ObrasSocialesRepository obrassocialesRepository;

    @Autowired
    public ObrasSocialesService(ObrasSocialesRepository obrassocialesRepository) {
        this.obrassocialesRepository = obrassocialesRepository;
    }

    public List<ObrasSociales> getObrasSociales() {
        return this.obrassocialesRepository.findAll();
    }

    public ResponseEntity<Object> newObraSocial(ObrasSociales obrasocial) {

        Optional<ObrasSociales> resp = obrassocialesRepository.findByNombre(obrasocial.getNombre());
        datos = new HashMap<>();

        if (resp.isPresent() && obrasocial.getId_os()==null) {
            datos.put("error", true);
            datos.put("message","El nombre ya existe");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
                    );
        }
        datos.put("message", "La Obra social se ha registrado correctamente");
        if(obrasocial.getId_os()!=null){
            datos.put("message", "La Obra Social se ha actualizado correctamente");
        }
        obrassocialesRepository.save(obrasocial);
        datos.put("data",obrasocial);
        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
    }

    public ResponseEntity<Object> deleteObraSocial(Long id) {
        boolean existe = this.obrassocialesRepository.existsById(id);
        datos = new HashMap<>();
        if(!existe) {
            datos.put("error", true);
            datos.put("message","No existe Obra Social con el id seleccionado");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        obrassocialesRepository.deleteById(id);
        datos.put("message","La Obra Social fue eliminado correctamente");
        return new ResponseEntity<>(
                datos,
                HttpStatus.ACCEPTED
        );
    }
}
