package br.edu.nassau.backend_frameworks_atividade.service;

import org.springframework.stereotype.Service;

@Service
public class CursoService {
    public String getCurso() {
        return "Ciência da Computação";
    }
    public String getDisciplina() {
        return "Back-End Frameworks";
    }
}
