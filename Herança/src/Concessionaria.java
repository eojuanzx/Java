/**
 * Classe para ...
 * @author Pedro Henrique dos Santos
 * @date Classe criada em 19/09/2024
 */
public class Concessionaria {
    //psvm + tab
    public static void main(String[] args) {
        Carro a = new Carro("Chevrolet", "Opala", 1977, 45000, 4.1f, 450, 5);
        Carro b = new Carro("Mercedes", "AMG A45", 2022, 300000, 2.0f, 250, 5);
        Carro c = new Carro("Volkswagen", "Gol", 1997, 10000, 1.8f, 350, 5);
        
        Caminhão d = new Caminhão("Astra", "CIFA RY 1300", 2009, 50000, "3/4", 4, 5, true);
        Caminhão e = new Caminhão("Bastra", "CIFA RY 1301", 2010, 51000, "Toco", 4, 5, false);
        Caminhão f = new Caminhão("Castra", "CIFA RY 1302", 2011, 52000, "Truck", 4, 5, false);
        
        a.exibirDadosCarro();
        b.exibirDadosCarro();
        c.exibirDadosCarro();
        
        d.exibirDadosCaminhão();
        e.exibirDadosCaminhão();
        f.exibirDadosCaminhão();
    }//fim do main
}//fim da classe
