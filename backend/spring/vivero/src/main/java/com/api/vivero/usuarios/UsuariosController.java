package com.api.vivero.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="api/V1/usuarios")
public class UsuariosController {
    private final UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GetMapping
    public List<Usuarios> getUsuarios() {
        return usuariosService.getUsuarios();
    }
    @GetMapping(path="{usuarioDni}")
    public Object getUsuario(@PathVariable("usuarioDni")Long dni) {
        return this.usuariosService.getUsuario(dni);
    }

    @PostMapping
    public ResponseEntity<Object> cearUsuario(@RequestBody Usuarios usuario) {
        return this.usuariosService.newUsuario(usuario);
    }
    @PutMapping
    public ResponseEntity<Object> actualizarUsuario(@RequestBody Usuarios usuario) {
        return this.usuariosService.newUsuario(usuario);
    }
    @DeleteMapping(path="{usuarioId}")
    public  ResponseEntity<Object> eliminarUsuario(@PathVariable("usuarioId")Long id) {
        return this.usuariosService.deleteUsuario(id);
    }
}