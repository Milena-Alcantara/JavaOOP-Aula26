package Ex1;

public class Main {
    public static void main(String[] args) {

        Renault carro = new Renault("","Azul", 2020, 3, 500000, 0);

        Fiat carro2 = new Fiat("","Vermelho",2020,4,600000,0);

        Hyundai carro3 = new Hyundai("","Prata",2020,4,400000,0);


        carro3.iniciarPartida();
        carro3.freiar();
        carro3.acelerar();

    }
}