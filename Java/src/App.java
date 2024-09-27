import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Filmes> catalogo = new ArrayList<>();
        ArrayList<Carros> carros = new ArrayList<>();
        ArrayList<Livros> livro = new ArrayList<>();
        catalogo.add(new Filmes("FNAF", 1999, 136));
        catalogo.add(new Filmes("Inception", 2010, 148));
        carros.add(new Carros("Ford", "ka", 148));
        livro.add(new Livros("takagi-san", "seila", 2016));

        for (Filmes filme : catalogo) {
            System.out.println(filme);
        }
        for (Carros carro : carros) {
            System.out.println(carro);
        }
        for (Livros livros : livro) {
            System.out.println(livros);
        }
    }
}
