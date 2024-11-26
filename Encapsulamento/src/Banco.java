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
    
    
    public void menu(){
        
        
    }
    
    
    public static void main(String[] args) {
        Conta cc = new Conta("Juan", 2500d, 1234);
        
        //cc.realizarDeposito();
        //cc.realizarSaque();
        //cc.trocarSenha();
        //cc.exibirDadosconta();
        //cc.exibirSaldo();
        boolean sair = false;
        
        while(!sair){
            String opcao = JOptionPane.showInputDialog(
            "Escolha uma operação:\n" +
            "1 - Realizar Saque\n" +
            "2 - Realizar Depósito\n" +
            "3 - Exibir Saldo\n" +
            "4 - Trocar Senha\n" +
            "5 - Sair");
            
           switch (opcao){
               case "1":
                   cc.realizarSaque();
                   break;
               case "2":
                   cc.realizarDeposito();
                   break;
               case "3":
                   cc.exibirSaldo();
                   break;
               case "4":
                   cc.trocarSenha();
                   break;
               case "5":
                   sair = true;
                   JOptionPane.showMessageDialog(null, "Saindo...");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opção inválida!");
           }
            
        }
        cc.exibirDadosconta();
        
    }

}//Fim da classe
