package com.consultorio.dramado.obrassociales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/V1/obrassociales")
public class ObrasSocialesController {
    private final ObrasSocialesService obrassocialesService;

    @Autowired
    public ObrasSocialesController(ObrasSocialesService obrassocialesService) {
        this.obrassocialesService = obrassocialesService;
    }

    @GetMapping
    public List<ObrasSociales> getObrassociales() {
        return obrassocialesService.getObrasSociales();
    }

    @PostMapping
    public ResponseEntity<Object> cearObrasocial(@RequestBody ObrasSociales obraSocial) {
        return this.obrassocialesService.newObraSocial(obraSocial);
    }
    @PutMapping
    public ResponseEntity<Object> actualizarObraSocial(@RequestBody ObrasSociales obraSocial) {
        return this.obrassocialesService.newObraSocial(obraSocial);
    }
    @DeleteMapping(path="{usuarioId}")
    public  ResponseEntity<Object> eliminarObrasocial(@PathVariable("osbrasocialId")Long id) {
        return this.obrassocialesService.deleteObraSocial(id);
    }
}