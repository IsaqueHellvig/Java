public class Livros {
    private String Titulo;
    private String Autor;
    private int AnoPublicado;

    Livros(String Titulo,String Autor,int AnoPublicado){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.AnoPublicado = AnoPublicado;
    }

    @Override
    public String toString() {
        return "Titulo: " + Titulo + ", Autor: " + Autor + ", Ano Publicado: " + AnoPublicado ;
    }

    

}
