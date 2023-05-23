package Ex1;

public class Hyundai extends Carro{

    public Hyundai(String marca, String cor, int ano, int porta, double valor, double velocidade) {
        super("Hyundai", cor, ano, porta, valor, 5);
    }
    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando motor... Minha velocidade está: " + (velocidade) + "km/h");
    }

    @Override
    public void freiar() {
        if (velocidade <=2) {
            System.out.println("Carro parado");
        } else {
            System.out.println("Freiando...minha velocidade está em: " + (velocidade-=2) + "km/h");
        }
    }
    @Override
    public void acelerar(){
        System.out.println("Acelerando... minha velocidade está em: "+ (velocidade += 15)+ "km/h");
    }
}
