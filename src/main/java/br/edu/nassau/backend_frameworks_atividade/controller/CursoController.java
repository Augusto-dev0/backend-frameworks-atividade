package br.edu.nassau.backend_frameworks_atividade.controller;

import br.edu.nassau.backend_frameworks_atividade.service.CursoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/curso")
    public String curso() {
        return cursoService.getCurso();
    }

    @GetMapping("/disciplina")
    public String disciplina() {
        return cursoService.getDisciplina();
    }
}