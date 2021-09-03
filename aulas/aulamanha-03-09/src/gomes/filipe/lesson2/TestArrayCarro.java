package gomes.filipe.lesson2;

public class TestArrayCarro {
    public static void main(String[] args) {
        Carro[] carros;
        carros = new Carro[3];

        carros[0] = new Carro("Jeep", "Renegade Trailhawk 2.0 Diesel AT 4×4", 2021, "Preta", 172_990);
        carros[1] = new Carro("Hyundai", "Creta 1.6 Flex", 2021, "Azul marinho", 71_986);
        carros[2] = new Carro("CAOA", "Exceed LX 1.6 TGDI", 2021, "Laranja", 250_000);

        System.out.println(carros[0].marca);
        System.out.println(carros[0].modelo);
        System.out.println(carros[0].anofabricacao);
        System.out.println(carros[0].cor);
        System.out.println(carros[0].preco);

        System.out.println();

        System.out.println(carros[1].marca);
        System.out.println(carros[1].modelo);
        System.out.println(carros[1].anofabricacao);
        System.out.println(carros[1].cor);
        System.out.println(carros[1].preco);

        System.out.println();

        System.out.println(carros[2].marca);
        System.out.println(carros[2].modelo);
        System.out.println(carros[2].anofabricacao);
        System.out.println(carros[2].cor);
        System.out.println(carros[2].preco);
    }

}
