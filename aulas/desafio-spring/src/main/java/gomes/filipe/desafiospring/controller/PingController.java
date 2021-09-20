package gomes.filipe.desafiospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PingController {

    @ResponseBody
    @GetMapping("/ping")
    public String palavra() {
        return "pong";
    }
}
