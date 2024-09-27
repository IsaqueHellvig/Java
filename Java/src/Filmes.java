public class Filmes {
    private String Titulo;
    private int AnoLancamento;
    private int Duracao;

    Filmes(String Titulo, int AnoLancamento, int Duracao){
        this.Titulo = Titulo;
        this.AnoLancamento = AnoLancamento;
        this.Duracao = Duracao;
    }

    public String getTitulo(){
        return Titulo;
    }

    public int getAnoLancamento(){
        return AnoLancamento;
    }

    public int getDuracao(){
        return Duracao;
    }

    @Override
    public String toString(){
        return "Filme: " + Titulo + ",Ano: " + AnoLancamento + ",Duração: " + Duracao + " minutos";
    }
}
