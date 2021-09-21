package gomes.filipe.desafiospring.service;

import gomes.filipe.desafiospring.entity.Aluno;
import gomes.filipe.desafiospring.entity.Disciplina;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno adicionaAluno(Aluno aluno) {
        alunos.add(aluno);
        return aluno;
    }

    public List<Aluno> listaAlunos() {
        return alunos;
    }

    public Aluno getAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public String mediaAluno(String nome) {
        double media = 0;
        Aluno aluno = getAluno(nome);
        for (Disciplina disciplina: aluno.getlistaDisciplinas()) {
            media += disciplina.getNota();
        }
        return aluno.toString() + "\nMédia " + media/aluno.getlistaDisciplinas().size();
    }

    public Aluno alterarAluno(Aluno aluno) {
        for (Aluno al : listaAlunos()) {
            if (al.getNome().equals(aluno.getNome())) {
                alunos.set(alunos.indexOf(al), aluno);
                return aluno;
            }
        }
        return null;
    }

    public String removerAluno(Aluno aluno) {
        for (Aluno al : alunos) {
            if (al.getNome().equals(aluno.getNome())) {
                alunos.remove(al);
                return "Aluno removido\n\n" + al.toString();
            }
        }
        return "Aluno não encontrado !";
    }





}
