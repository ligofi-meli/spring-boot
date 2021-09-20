package gomes.filipe.desafiospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class NewPingController {

    @GetMapping("/ping")
    public String palavra() {
        return "new pong";
    }
}
