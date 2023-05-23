package Ex2;

public class Main {
    public static void main(String[] args) {
        Biblioteca livro1 = new Biblioteca();
        Biblioteca livro2 = new Biblioteca();
        Biblioteca livro3 = new Biblioteca();
        Biblioteca livro4 = new Biblioteca();

        livro1.registrarLivro(123456);
        livro2.registrarLivro(546272848,"Diario de um banana");
        livro3.registrarLivro(562389,"Além do bem e do mal", "Filosofia");
        livro4.registrarLivro(672137, "Mulheres, raça e classe","Aventura","Angela Davis");

    }}

