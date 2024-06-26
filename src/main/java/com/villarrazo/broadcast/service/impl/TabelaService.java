package com.villarrazo.broadcast.service.impl;

import com.villarrazo.broadcast.model.TabelaDTO;
import com.villarrazo.broadcast.model.Tabela;
import com.villarrazo.broadcast.repository.TabelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TabelaService implements com.villarrazo.broadcast.service.TabelaService {

    @Autowired
    private TabelaRepository tabelaRepository;
    @Transactional
    public List<Tabela> getAllTeams() {
        return tabelaRepository.findAll();
    }
    @Transactional
    public Tabela getTeamById(Long id) {
        return tabelaRepository.findById(id).orElse(null);
    }
    @Transactional
    public Tabela createTeam(TabelaDTO tabelaDTO) {
        Tabela tabela = new Tabela();
        tabela.setTeam(tabelaDTO.team());
        tabela.setPoints(tabelaDTO.points());
        tabela.setGoals(tabelaDTO.goals());
        tabela.setWin(tabelaDTO.win());
        return tabelaRepository.save(tabela);
    }
    @Transactional
    public Tabela updateTeam(Long id, TabelaDTO tabelaDTO) {
        Tabela tabela = tabelaRepository.findById(id).orElse(null);
        if (tabela != null) {
            tabela.setTeam(tabelaDTO.team());
            tabela.setPoints(tabelaDTO.points());
            tabela.setGoals(tabelaDTO.goals());
            tabela.setWin(tabelaDTO.win());
            return tabelaRepository.save(tabela);
        }
        return null;
    }
    @Transactional
    public void deleteTeam(Long id) {
        tabelaRepository.deleteById(id);
    }
}
