package gomes.filipe.desafiospring.controller;

import gomes.filipe.desafiospring.entity.Aluno;
import gomes.filipe.desafiospring.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    //List<Aluno> alunoList = new ArrayList<>();

    @Autowired
    AlunoService alunoService;

    @GetMapping("/cadastra")
    public Aluno cadastraAluno(@RequestBody Aluno aluno) {
        alunoService.recebeAlunos(aluno);
        return aluno;
    }

    @GetMapping("/aluno")
    public void encontraAluno(@RequestBody Aluno aluno) {
        
    }


}
