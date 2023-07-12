package com.example.softuraa.controller;

import com.example.softuraa.model.Psicologo;
import com.example.softuraa.service.PsicologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/psicologos")
public class PsicologoController {
    private final PsicologoService psicologoService;

    @Autowired
    public PsicologoController(PsicologoService psicologoService) {
        this.psicologoService = psicologoService;
    }

    @PostMapping
    public ResponseEntity<Psicologo> crearPsicologo(@RequestBody Psicologo psicologo) {
        Psicologo psicologoCreado = psicologoService.crearPsicologo(psicologo);
        return new ResponseEntity<>(psicologoCreado, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Psicologo> obtenerPsicologoPorId(@PathVariable("id") Long id) {
        Psicologo psicologo = psicologoService.obtenerPsicologoPorId(id);
        if (psicologo != null) {
            return new ResponseEntity<>(psicologo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Psicologo> actualizarPsicologo(@PathVariable("id") Long id, @RequestBody Psicologo psicologo) {
        psicologo.setPsicologoID(id);
        Psicologo psicologoActualizado = psicologoService.actualizarPsicologo(psicologo);
        if (psicologoActualizado != null) {
            return new ResponseEntity<>(psicologoActualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPsicologo(@PathVariable("id") Long id) {
        psicologoService.eliminarPsicologo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
