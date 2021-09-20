package gomes.filipe.desafiospring.service;

import gomes.filipe.desafiospring.entity.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlunoService {

    ArrayList<Aluno> alunos = new ArrayList<>();

    public void recebeAlunos(Aluno aluno) {
        alunos.add(aluno);
    }
}
