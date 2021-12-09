package com.exoSpring.seismeLocation.controllers;

import com.exoSpring.seismeLocation.dtos.SeismeDTO;
import com.exoSpring.seismeLocation.dtos.SeismeDeleteDTO;
import com.exoSpring.seismeLocation.dtos.SeismeSaveDTO;
import com.exoSpring.seismeLocation.dtos.SeismeUpdateDTO;
import com.exoSpring.seismeLocation.services.SeismeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seismes")
public class SeismeController {

    private SeismeService service;

    public SeismeController(SeismeService service) {
        this.service = service;
    }

    /**
     * Retourne une liste d'articles
     * @return List Post
     */
    @GetMapping()
    public List<SeismeDTO> getSeismes() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<SeismeDTO> find(@PathVariable String id) {
        SeismeDTO seismeDTO = service.find(id);
        if (seismeDTO == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(seismeDTO);
    }


    @PostMapping()
    public SeismeDTO save(@RequestBody SeismeSaveDTO post) {
        return service.save(post);
    }


    @PutMapping()
    public SeismeDTO update(@RequestBody SeismeUpdateDTO seisme) {
        return service.update(seisme);
    }


    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody SeismeDeleteDTO seismeDeleteDTO) {
        service.delete(seismeDeleteDTO);
        return ResponseEntity.ok(true);
    }
}
