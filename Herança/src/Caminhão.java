/**
 * Classe herdeira de 'Veiculo' para gerar um objeto do tipo caminhão
 * @author Pedro Henrique dos Santos
 * @date Classe criada em 19/09/2024
 */
public class Caminhão extends Veiculo{
    String tipoCaminhão;
    int numEixos;
    int qtdPneus;
    boolean refrigerado;
    
    //construtor do objeto caminhão
    public Caminhão(String marca, String modelo, int ano, float preço, String tipoCaminhão, int numEixos, int qtdPneus, boolean refrigerado) {
        super(marca, modelo, ano, preço);
        this.tipoCaminhão = tipoCaminhão;
        this.numEixos = numEixos;
        this.qtdPneus = qtdPneus;
        this.refrigerado = refrigerado;
    }
    
    //metodo comum para exibir dados do 'Carro'
    public void exibirDadosCaminhão(){
        super.exibirDadosVeiculo();
        System.out.println("Tipo: " + tipoCaminhão);
        System.out.println("Número de eixos: " + numEixos);
        System.out.println("Quantidade de pneus: " + qtdPneus);
        System.out.println("Refrigerado: " + (refrigerado?"sim":"não"));//um IF dentro do println
        System.out.println("");
    }
    
}//fim da classe
