/**
 * Classe herdeira de 'Veiculo' para gerar um objeto do tipo carro
 * @author Pedro Henrique dos Santos
 * @date Classe criada em 19/09/2024
 */
public class Carro extends Veiculo{
    float potencia;
    int volumePM;
    int numPass;
    
    //construtor do objeto carro
    public Carro(String marca, String modelo, int ano, float preço, float potencia, int volumePM, int numPass){
        super(marca, modelo, ano, preço);//enviar os atributos para a classe de cima ('Veiculo')
        this.potencia = potencia;
        this.volumePM = volumePM;
        this.numPass = numPass;
    }
    
    //metodo comum para exibir dados do 'Carro'
    public void exibirDadosCarro(){
        super.exibirDadosVeiculo();
        System.out.println("Potência: " + potencia);
        System.out.println("Volume do porta malas: " + volumePM);
        System.out.println("Número de passageiros: " + numPass);
        System.out.println("");
    }
    
}//fim da classe
