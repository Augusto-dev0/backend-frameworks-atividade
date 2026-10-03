package br.edu.nassau.backend_frameworks_atividade.service;

import br.edu.nassau.backend_frameworks_atividade.model.Aluno;
import br.edu.nassau.backend_frameworks_atividade.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listar() {
        return alunoRepository.findAll();
    }

    public Aluno matricular(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}