package br.edu.nassau.backend_frameworks_atividade.controller;

import br.edu.nassau.backend_frameworks_atividade.service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
    @GetMapping("/aluno")
    public String aluno() {
        return alunoService.getMatricula();
    }
}
