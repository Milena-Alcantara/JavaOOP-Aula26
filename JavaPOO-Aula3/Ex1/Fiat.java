package Ex1;

public class Fiat extends Carro{

    public Fiat(String marca, String cor, int ano, int porta, double valor, double velocidade) {
        super("Fiat", cor, ano, porta, valor, 3);
    }

    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando motor... Minha velocidade está: " + (velocidade) + "km/h");
    }

    @Override
    public void freiar() {
        if (velocidade <=6) {
            System.out.println("Carro parado");
        } else {
            System.out.println("Freiando...minha velocidade está em: " + (velocidade-=6) + "km/h");
        }
    }
    @Override
    public void acelerar(){
        System.out.println("Acelerando... minha velocidade está em: "+ (velocidade += 12)+ "km/h");
    }
}
