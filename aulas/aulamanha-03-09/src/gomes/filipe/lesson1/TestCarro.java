package gomes.filipe.lesson1;

import java.text.NumberFormat;
import java.util.Locale;

public class TestCarro {
    public static void main(String[] args) {
        Locale localeBrasil = new Locale("pt", "BR");
        Carro multivan; // definicao da variavel multivan
        multivan = new Carro(); // instanciando a variavel multivan como um objeto da classe Carro na memoria ram

        multivan.marca = "Fiat";
        multivan.modelo = "Fiat Doblo Adventure 1.8 8V Flex";
        multivan.anofabricacao = 2021;
        multivan.cor = "Verde Musgo";
        multivan.preco = 95_890;

        System.out.println("\nMarca: " + multivan.marca);
        System.out.println("Modelo: " + multivan.modelo);
        System.out.println("Ano Fabricacao: " + multivan.anofabricacao);
        System.out.println("Cor: " + multivan.cor);
        System.out.println("Preco: " +  NumberFormat.getCurrencyInstance(localeBrasil).format(multivan.preco));

        Carro utilitario;
        utilitario = multivan;

        System.out.println("\nMarca: " + utilitario.marca);
        System.out.println("Modelo: " + utilitario.modelo);
        System.out.println("Ano Fabricacao: " + utilitario.anofabricacao);
        System.out.println("Cor: " + utilitario.cor);
        System.out.println("Preco: " +  NumberFormat.getCurrencyInstance(localeBrasil).format(utilitario.preco));

        Carro suvSport;
        suvSport = new Carro();

        suvSport.marca = "Mitsubish";
        suvSport.modelo = "Pajero Sport HPE-S 2.4 4x4";
        suvSport.anofabricacao = 2021;
        suvSport.cor = "Prata";
        suvSport.preco = 383_990;


        System.out.println("\nMarca: " + suvSport.marca);
        System.out.println("Modelo: " + suvSport.modelo);
        System.out.println("Ano Fabricacao: " + suvSport.anofabricacao);
        System.out.println("Cor: " + suvSport.cor);
        System.out.println("Preco: " +  NumberFormat.getCurrencyInstance(localeBrasil).format(suvSport.preco));
    }
}
