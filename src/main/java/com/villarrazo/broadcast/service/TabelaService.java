package com.villarrazo.broadcast.service;

import com.villarrazo.broadcast.model.Tabela;
import com.villarrazo.broadcast.model.TabelaDTO;

import java.util.List;

public interface TabelaService {
    List<Tabela> getAllTeams();
    Tabela getTeamById(Long id);
    Tabela createTeam(TabelaDTO tabelaDTO);
    Tabela updateTeam(Long id, TabelaDTO tabelaDTO);
    void deleteTeam(Long id);
}
