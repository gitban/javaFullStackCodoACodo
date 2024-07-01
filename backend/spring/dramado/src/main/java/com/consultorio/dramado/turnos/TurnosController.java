package com.consultorio.dramado.turnos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="api/V1/turnos")
public class TurnosController {
    private final TurnosService turnosService;

    @Autowired
    public TurnosController(TurnosService turnosService) {
        this.turnosService = turnosService;
    }

    @GetMapping
    public List<Turnos> getTurnos() {
        return turnosService.getTurnos();
    }

    @GetMapping(path="{turnoId}")
    public Object getTurno(@PathVariable("turnoId")Integer id) {
        return this.turnosService.getTurno(id);
    }

    @GetMapping(path="asignado/{turnoAsignado}")
    public Object getTurnoLibre(@PathVariable("turnoAsignado")Boolean asignado) {
        return this.turnosService.getTurnoLibre(asignado);
    }

    @PostMapping
    public ResponseEntity<Object> cearTurno(@RequestBody Turnos turno) {
        return this.turnosService.newTurno(turno);
    }
    @PutMapping
    public ResponseEntity<Object> actualizarTurno(@RequestBody Turnos turno) {
        return this.turnosService.newTurno(turno);
    }
    @DeleteMapping(path="{turnoId}")
    public  ResponseEntity<Object> eliminarTurno(@PathVariable("turnoId")Long id) {
        return this.turnosService.deleteTurno(id);
    }
}