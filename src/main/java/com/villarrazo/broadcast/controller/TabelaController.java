package com.villarrazo.broadcast.controller;

import com.villarrazo.broadcast.model.Tabela;
import com.villarrazo.broadcast.model.TabelaDTO;
import com.villarrazo.broadcast.service.TabelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tabela")
public class TabelaController {

    @Autowired
    private TabelaService tabelaService;

    @GetMapping
    public ResponseEntity<List<Tabela>> getAllTeams() {
        List<Tabela> teams = tabelaService.getAllTeams();
        return new ResponseEntity<>(teams, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tabela> getTeamById(@PathVariable Long id) {
        Tabela team = tabelaService.getTeamById(id);
        return new ResponseEntity<>(team, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Tabela> createTeam(@RequestBody TabelaDTO tabelaDTO) {
        Tabela newTeam = tabelaService.createTeam(tabelaDTO);
        return new ResponseEntity<>(newTeam, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tabela> updateTeam(@PathVariable Long id, @RequestBody TabelaDTO tabelaDTO) {
        Tabela updatedTeam = tabelaService.updateTeam(id, tabelaDTO);
        return new ResponseEntity<>(updatedTeam, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deleteTeam(@PathVariable Long id) {
        tabelaService.deleteTeam(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}