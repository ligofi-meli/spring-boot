package gomes.filipe.aulamanha.controller;

import gomes.filipe.aulamanha.AlunoService;
import gomes.filipe.aulamanha.dto.AlunoDto;
import gomes.filipe.aulamanha.entity.Aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired // injeta e controla o ciclo de vida do objeto, o spring que instancia e reaproveita as instancias
    private AlunoService alunoService; // injecao de dependencia + inversao de controle

    @PostMapping("/cadastra")
    public ResponseEntity<AlunoDto> cadastra(@RequestBody AlunoDto alunoDto, UriComponentsBuilder uriBuilder) {
        Aluno aluno = alunoDto.converte();
        Aluno alunoCadastrado = alunoService.cadastra(aluno);

        URI uri = uriBuilder.path("/alunos/{id}").buildAndExpand(alunoCadastrado.getId()).toUri();
        return ResponseEntity.created(uri).body(AlunoDto.converte(alunoCadastrado));
    }

    @GetMapping("/{id}")
    public AlunoDto obtemAluno(@PathVariable("id") Long id) {
        Aluno aluno = alunoService.get(id);
        AlunoDto dto = null;
        if(aluno != null) {
            dto = AlunoDto.converte(aluno);
        }
        return dto;
    }

    @GetMapping("/ping")
    public String ping() {
        System.out.println("Ping Pong");
        return "pong";
    }
}
