package gomes.filipe.lesson1;

public class TestArrayCarro {
    public static void main(String[] args) {
        Carro[] carros;
        carros = new Carro[3];

        for (int i = 0; i < 3; i++) {
            carros[i] = new Carro();
        }

        carros[0].marca = "Jeep";
        carros[0].modelo = "Renegade Trailhawk 2.0 Diesel AT 4×4";
        carros[0].anofabricacao = 2021;
        carros[0].cor = "Preta";
        carros[0].preco = 172_990;


        carros[1].marca = "Hyundai";
        carros[1].modelo = "Creta 1.6 Flex";
        carros[1].anofabricacao = 2021;
        carros[1].cor = "Azul marinho";
        carros[1].preco = 71_986;


        carros[2].marca = "CAOA";
        carros[2].modelo = "Exceed LX 1.6 TGDI";
        carros[2].anofabricacao = 2021;
        carros[2].cor = "Laranja";
        carros[2].preco = 250_000;

        System.out.println(carros[0].marca);
        System.out.println(carros[1].marca);
        System.out.println(carros[2].marca);
    }
}
