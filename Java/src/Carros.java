public class Carros {
    private String Marca;
    private String Modelo;
    private int Ano;

    Carros(String Marca,String Modelo,int Ano){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
    }

    @Override
    public String toString() {
        return "Marca=" + Marca + ", Modelo=" + Modelo + ", Ano=" + Ano ;
    }

    

}
