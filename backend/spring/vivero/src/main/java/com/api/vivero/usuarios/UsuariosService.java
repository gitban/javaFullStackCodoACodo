package com.api.vivero.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

    HashMap<String,Object> datos;

    private final UsuariosRepository usuarioRepository;

    @Autowired
    public UsuariosService(UsuariosRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuarios> getUsuarios() {
        return this.usuarioRepository.findAll();
    }

    public Object getUsuario(Long dni) {
        return this.usuarioRepository.findByDni(dni);
    }

    public ResponseEntity<Object> newUsuario(Usuarios usuario) {

        Optional<Usuarios> resp = usuarioRepository.findByDni(usuario.getDni());
        datos = new HashMap<>();

        if (resp.isPresent() && usuario.getId()==null) {
            datos.put("error", true);
            datos.put("message","El DNI de usuario ya existe");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
                    );
        }
        datos.put("message", "El usuario se ha registrado correctamente");
        if(usuario.getId()!=null){
            datos.put("message", "El usuario se ha actualizado correctamente");
        }
        usuarioRepository.save(usuario);
        datos.put("data",usuario);
        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
    }

    public ResponseEntity<Object> deleteUsuario(Long id) {
        boolean existe = this.usuarioRepository.existsById(id);
        datos = new HashMap<>();
        if(!existe) {
            datos.put("error", true);
            datos.put("message","No existe el usuario con el id seleccionado");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        usuarioRepository.deleteById(id);
        datos.put("message","El usuario fue eliminado correctamente");
        return new ResponseEntity<>(
                datos,
                HttpStatus.ACCEPTED
        );
    }
}
