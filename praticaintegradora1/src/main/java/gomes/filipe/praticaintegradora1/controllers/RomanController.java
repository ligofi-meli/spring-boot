package gomes.filipe.praticaintegradora1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanController {
    public int[] values = {1_000_000_000,1_000_000,500_000,100_000,50_000,10_000,9_000,8_000,7_000,6_000,5_000,4_000, 3_000, 2_000, 1_000,500,100,50,10, 5, 1};
    public String[] romanNumerals = {"1_000_001_000","1_000_000","500_000","100_000","50_000","1_0000","9_000","8_000", "7_000", "6_000", "5_000", "MMM", "MM", "M","D","C","L","X", "V", "I"};

    //Url para teste -> http://localhost:8080/convertNumbers/120
    @GetMapping("convertNumbers/{number}")
    public String roman(@PathVariable int number) {
        StringBuilder romans = new StringBuilder();
        int decimal = number;
        for (int i = 0; i < values.length; i++) {
            while(number >= values[i]) {
                number -= values[i];
                romans.append(romanNumerals[i]);
            }
        }
        romans = new StringBuilder(romans.toString().replace("IIII", "IV"));
        romans = new StringBuilder(romans.toString().replace("VIIII", "IX"));
        romans = new StringBuilder(romans.toString().replace("XXXX", "XL"));
        romans = new StringBuilder(romans.toString().replace("LXXXX", "XC"));
        romans = new StringBuilder(romans.toString().replace("CCCC", "CD"));
        romans = new StringBuilder(romans.toString().replace("DCD", "CM"));
        romans = new StringBuilder(romans.toString().replace("4_000", "<span style=\"text-decoration:overline;\">IV</span>"));
        romans = new StringBuilder(romans.toString().replace("5_000", "<span style=\"text-decoration:overline;\">V</span>"));
        romans = new StringBuilder(romans.toString().replace("6_000", "<span style=\"text-decoration:overline;\">VI</span>"));
        romans = new StringBuilder(romans.toString().replace("7_000", "<span style=\"text-decoration:overline;\">VII</span>"));
        romans = new StringBuilder(romans.toString().replace("8_000", "<span style=\"text-decoration:overline;\">VIII</span>"));
        romans = new StringBuilder(romans.toString().replace("9_000", "<span style=\"text-decoration:overline;\">IX</span>"));
        romans = new StringBuilder(romans.toString().replace("10_000", "<span style=\"text-decoration:overline;\">X</span>"));
        romans = new StringBuilder(romans.toString().replace("50_000", "<span style=\"text-decoration:overline;\">L</span>"));
        romans = new StringBuilder(romans.toString().replace("100_000", "<span style=\"text-decoration:overline;\">C</span>"));
        romans = new StringBuilder(romans.toString().replace("500_000", "<span style=\"text-decoration:overline;\">D</span>"));
        romans = new StringBuilder(romans.toString().replace("1_000_000", "<span style=\"text-decoration:overline;\">M</span>"));
        romans = new StringBuilder(romans.toString().replace("1_000_001_000", "<span style=\"text-decoration:overline double;\">M</span>"));

        return "Número inteiro: " + decimal + "<br><br>Numeral romano: " + romans;
    }
}
