package br.edu.nassau.backend_frameworks_atividade.repository;

import br.edu.nassau.backend_frameworks_atividade.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}