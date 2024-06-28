package com.consultorio.dramado.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

    HashMap<String,Object> datos;

    private final UsuariosRepository usuariosRepository;

    @Autowired
    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    public List<Usuarios> getUsuarios() {
        return this.usuariosRepository.findAll();
    }

    public ResponseEntity<Object> newUsuario(Usuarios usuario) {

        Optional<Usuarios> resp = usuariosRepository.findByEmail(usuario.getEmail());
        datos = new HashMap<>();

        if (resp.isPresent() && usuario.getId()==null) {
            datos.put("error", true);
            datos.put("message","El email ya existe");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
                    );
        }
        datos.put("message", "El usuario se ha registrado correctamente");
        if(usuario.getId()!=null){
            datos.put("message", "El usuario se ha actualizado correctamente");
        }
        usuariosRepository.save(usuario);
        datos.put("data",usuario);
        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
    }

    public ResponseEntity<Object> deleteUsuario(Long id) {
        boolean existe = this.usuariosRepository.existsById(id);
        datos = new HashMap<>();
        if(!existe) {
            datos.put("error", true);
            datos.put("message","No existe el usuario con el id seleccionado");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        usuariosRepository.deleteById(id);
        datos.put("message","El usuario fue eliminado correctamente");
        return new ResponseEntity<>(
                datos,
                HttpStatus.ACCEPTED
        );
    }
}
