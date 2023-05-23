package Ex2;

public class Biblioteca {

    String nome;
    int isbn;
    String genero;
    String autorLivro;

    public void registrarLivro(int isbn){
        System.out.println("O livro foi registrado com o isbn: "+isbn);
    }
    public void registrarLivro(int isbn, String nome){
        System.out.println("O livro foi registrado com o isbn: "+isbn+ " e o nome: "+nome);
    }

    public void registrarLivro(int isbn, String nome,String genero){
        System.out.println("O livro foi registrado com o isbn: "+isbn+ " e o nome: "+nome+ " e o gênero: "+genero);
    }

    public void registrarLivro(int isbn, String nome,String genero, String autorLivro){
        System.out.println("O livro foi registrado com todos os atributos");
    }
}
