package gomes.filipe.praticaintegradora2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ConverteController {

    @GetMapping("/converter")
    //http://localhost:8080/converter?frase=-...%20---%20--%20/%20-..%20..%20.-
    public String codigoMorse(String[] args, @RequestParam String frase) {
        String texto = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..", " "};

        StringBuilder textoAlfabeto = new StringBuilder();
        String[] posic = frase.split(" ");
        boolean erro = true;

        for (int i = 0; i < posic.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(posic[i])) {
                    erro = false;
                    textoAlfabeto.append(Letra(j));
                }
            }
        }
        if(erro){
            texto = "Operacao Invalida";
        }else{
            texto = String.valueOf(textoAlfabeto);
        }
        return texto;
    }
    public static String Letra(int indice) {
        int i = indice;
        String[] portugues = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?", " "};
        return portugues[i];
    }
}