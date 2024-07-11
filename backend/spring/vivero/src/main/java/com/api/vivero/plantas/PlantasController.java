package com.api.vivero.plantas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="api/V1/plantas")
public class PlantasController {
    private final PlantasService plantasService;

    @Autowired
    public PlantasController(PlantasService plantasService) {
        this.plantasService = plantasService;
    }

    @GetMapping
    public List<Plantas> getPlantas() {
        return plantasService.getPlantas();
    }

    @GetMapping(path="{plantaId}")
    public Object getPlanta(@PathVariable("plantaId")Integer id) {
        return this.plantasService.getPlanta(id);
    }

    @PostMapping
    public ResponseEntity<Object> cearPlanta(@RequestBody Plantas planta) {
        return this.plantasService.newPlanta(planta);
    }
    @PutMapping
    public ResponseEntity<Object> actualizarPlanta(@RequestBody Plantas planta) {
        return this.plantasService.newPlanta(planta);
    }
    @DeleteMapping(path="{plantaId}")
    public  ResponseEntity<Object> eliminarPlanta(@PathVariable("plantaId")Long id) {
        return this.plantasService.deletePlanta(id);
    }
}
