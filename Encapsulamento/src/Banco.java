/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para instanciar objetos encapsulados da classe Conta
 * @author Juan Nascimento
 *@since Classe criada em 17/10/2024
 */
public class Banco {
    
    
    public static void main(String[] args) {
        Conta cc = new Conta("Juan", 2500d, 1234);
        
        //cc.realizarDeposito();
        //cc.realizarSaque();
        //cc.trocarSenha();
        //cc.exibirDadosconta();
        cc.exibirSaldo();
        
        
    }

}//Fim da classe