package com.example.softuraa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/evaluaciones")
public class EvaluacionController {
    private final EvaluacionService evaluacionService;

    @Autowired
    public EvaluacionController(EvaluacionService evaluacionService) {
        this.evaluacionService = evaluacionService;
    }

    @PostMapping
    public ResponseEntity<Evaluacion> crearEvaluacion(@RequestBody Evaluacion evaluacion) {
        Evaluacion evaluacionCreada = evaluacionService.crearEvaluacion(evaluacion);
        return new ResponseEntity<>(evaluacionCreada, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evaluacion> obtenerEvaluacionPorId(@PathVariable("id") Long id) {
        Evaluacion evaluacion = evaluacionService.obtenerEvaluacionPorId(id);
        if (evaluacion != null) {
            return new ResponseEntity<>(evaluacion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evaluacion> actualizarEvaluacion(@PathVariable("id") Long id, @RequestBody Evaluacion evaluacion) {
        evaluacion.setEvaluacionID(id);
        Evaluacion evaluacionActualizada = evaluacionService.actualizarEvaluacion(evaluacion);
        if (evaluacionActualizada != null) {
            return new ResponseEntity<>(evaluacionActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEvaluacion(@PathVariable("id") Long id) {
        evaluacionService.eliminarEvaluacion(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
