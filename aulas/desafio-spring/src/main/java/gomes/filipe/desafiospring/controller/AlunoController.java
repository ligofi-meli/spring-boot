package gomes.filipe.desafiospring.controller;

import gomes.filipe.desafiospring.entity.Aluno;
import gomes.filipe.desafiospring.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping("/cadastra")
    public Aluno cadastraAluno(@RequestBody Aluno aluno) {
        alunoService.adicionaAluno(aluno);
        return aluno;
    }

    @GetMapping("/exibirAlunos")
    public List<Aluno> exibirAlunos() {
        return alunoService.listaAlunos();
    }

    @GetMapping("/exibirAluno/{nome}")
    public Aluno exibirAluno(@PathVariable String nome) {
        return alunoService.getAluno(nome);
    }

    @GetMapping("/exibirMediaAluno/{nome}")
    public String exibirMediaAluno(@PathVariable String nome) {
        return alunoService.mediaAluno(nome);
    }


    @DeleteMapping("/removerAluno")
    public String removerAluno(@RequestBody Aluno aluno) {
        return alunoService.removerAluno(aluno);
    }
}
