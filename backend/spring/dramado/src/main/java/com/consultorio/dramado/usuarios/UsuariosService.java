package com.consultorio.dramado.usuarios;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UsuariosService {
    public List<Usuarios> getUsuarios() {
        return List.of(
                new Usuarios(
                        "Esteban",
                        "Pérez",
                        "estalej@gmail.com",
                        "219-4779973",
                        "Matheu 2878",
                        1
                )
        );
    }
}
