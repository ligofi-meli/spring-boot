package gomes.filipe.endpoints.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointsExample {
    // PRIMEIRO TIPO DE ENDPOINT
    // Este método é chamado apenas com a URL base: localhost:8080
    // pois o GetMapping não tem parâmetros
    @GetMapping
    public String primeiroEndPoint() {
        return "Primeiro EndPoint";
    }

    // SEGUNDO TIPO DE ENDPOINT
    // Este método é chamado utilizando a url base e declarando o EndPoint: localhost:8080/index
    @GetMapping("/index")
    public String segundoEndPoint() {
        return "Segundo EndPoint";
    }

    // TERCEIRO TIPO DE ENDPOINT - RECEBENDO UM VALOR PELA URL
    // Este método é chamado utilizando a url base e a variável entre {}: localhost:8080/nome
    @GetMapping("/{nome}")
    public String terceiroEndPoint(@PathVariable String nome) {
        return "Seu nome é " + nome;
    }

    // QUARTO TIPO DE ENDPOINT - RECEBENDO UM VALOR PELA URL
    // Este método é chamado com: localhost:8080/maioridade/nome
    @GetMapping("/{nome}/{idade}")
    public String quartoEndPoint(@PathVariable String nome, @PathVariable Integer idade) {
        if (idade >= 18) {
            return nome + " é maior de idade, sua idade é " + idade;
        } else {
            return nome + " é menor de idade, sua idade é " + idade;
        }
    }

    // QUINTO TIPO DE ENDPOINT - RECEBENDO UM VALOR PELA URL
    // Este método é chamado com: localhost:8080/test?nome=Filipe&idade=30
    @GetMapping("/test")
    public String quintoEndPoint(@RequestParam String nome, @RequestParam Integer idade) {
        if (idade >= 18) {
            return nome + " é maior de idade, sua idade é " + idade;
        } else {
            return nome + " é menor de idade, sua idade é " + idade;
        }
    }
}
