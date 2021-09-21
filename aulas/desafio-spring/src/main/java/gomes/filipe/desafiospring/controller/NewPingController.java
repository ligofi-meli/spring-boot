package gomes.filipe.desafiospring.controller;

import gomes.filipe.desafiospring.dto.ProfessorDTO;
import gomes.filipe.desafiospring.entity.Professor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping(value = "/home")
public class NewPingController {

    private Map<String, String> map = new HashMap<>();
    private Map<Long, Professor> mapaCompleto = new HashMap<>();

    public NewPingController () {
        map.put("fiipe", "gomes");

        mapaCompleto.put(1L, new Professor("filipe", "gomes", String.valueOf(ThreadLocalRandom.current().nextInt(100, 10000))));
    }

    @GetMapping(value = "/ping")
    public String palavra() {
        return "New Pong";
    }

    @GetMapping(value = "/pessoa")
    public String nomeCompleto(String nome) {
        if (nome.equalsIgnoreCase("filipe")) {
            return "Filipe Gomes de Lima";
        } else {
            return "Não é o Filipe";
        }
    }

    @GetMapping(value = "/pessoal")
    public String end2(String nome, String cargo) {
        if (nome.equalsIgnoreCase("filipe") && cargo.equalsIgnoreCase("professor")) {
            return "professor: Filipe Gomes de Lima";
        } else {
            if (nome.equalsIgnoreCase("filipe")) {
                return "aluno: Filipe Gomes de Lima";
            }
        }
        return "Não é o Filipe";
    }

    @GetMapping(value = "/query")
    public String consulta(@RequestParam("q") String primeiroNome) {
        Optional<String> item = map.entrySet().stream()
                .filter(e -> primeiroNome.equalsIgnoreCase(e.getKey()))
                .map(Map.Entry::getKey)
                .findFirst();
        return item.get();
    }

    @PostMapping(value = "/cadastra")
    public void cadastra(@RequestBody Professor payLoad) {
        map.put(payLoad.getPrimeiroNome(), payLoad.getSegundoNome());
    }

    @PutMapping(value = "/atualiza")
    public void atualizar(@RequestBody Professor payLoad) {
        map.put(payLoad.getPrimeiroNome(), payLoad.getSegundoNome());
    }

    @DeleteMapping(value = "deleta/{i}")
    public void remover(@PathVariable("i") String nome) {
        map.remove(nome);
    }

    @GetMapping(value = "/professores/{id}")
    public ProfessorDTO get(@PathVariable("id") Long id) {
        ProfessorDTO dto = new ProfessorDTO();
        mapaCompleto.forEach((k, v) -> {
            if (k.equals(id)) {
                dto.setPrimeiroNome(v.getPrimeiroNome());
                dto.setSegundoNome(v.getSegundoNome());
            }
        });
        return dto;
    }
}
