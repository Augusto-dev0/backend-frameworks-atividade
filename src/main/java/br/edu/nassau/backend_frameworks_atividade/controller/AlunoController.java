package br.edu.nassau.backend_frameworks_atividade.controller;

import br.edu.nassau.backend_frameworks_atividade.model.Aluno;
import br.edu.nassau.backend_frameworks_atividade.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listar() {
        return alunoService.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno matricular(@RequestBody Aluno aluno) {
        return alunoService.matricular(aluno);
    }
}