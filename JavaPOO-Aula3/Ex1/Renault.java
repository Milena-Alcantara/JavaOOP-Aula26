package Ex1;

public class Renault extends Carro {

    public Renault(String marca, String cor, int ano, int porta, double valor, double velocidade) {
        super("Renault", cor, ano, porta, valor, 0);

    }

    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando motor... Minha velocidade está: " + velocidade + "km/h");
    }


    @Override
    public void freiar() {
        if (!(velocidade == 0)) {
            System.out.println("Freiando...minha velocidade está em: " + (velocidade -= 5) + "km/h");
        } else {
            System.out.println("Velocidade está no mínimo");
        }
    }
    @Override
    public void acelerar(){
        System.out.println("Acelerando... minha velocidade está em: "+ (velocidade += 10)+ "km/h");
    }
}
