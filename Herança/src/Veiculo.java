/**
 * Classe para demonstrar o principio da herança em uma modelagem para automoveis
 * @author Pedro Henrique dos Santos
 * @date Classe criada em 19/09/2024
 */
public class Veiculo {
    String marca;
    String modelo;
    int ano;
    float preço;
    
    //construtor da classe 'Veiculo'
    public Veiculo(String marca, String modelo, int ano, float preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preço = preço;
    }
    
    public void exibirDadosVeiculo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + ano);
        System.out.println("Preço: " + preço);
    }
    
}//fim da classe
