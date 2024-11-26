
import java.util.Set;
import javax.swing.JOptionPane;


/**
 * Classe para demonstrar o princípio do encapsulamento
 * @author Juan Nascimento
 *@since Classe criada em 17/10/2024
 */
public class Conta {
    String cliente;
    private double saldo;
    private int senha;
    private boolean bloqueado;
    
    
    public Conta(String cliente, double saldo, int senha){
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.bloqueado = false;
    }
    
    public void exibirDadosconta(){
        
        JOptionPane.showInputDialog(
            "Nome do cliente: " + cliente + "\n" +
            "Saldo: " + saldo + "\n" +
            "Conta bloqueada ?" + (isBloqueado() == true?"Sim":"Não"));
        
        /*System.out.println("Nome do cliente: ".concat(cliente));
        System.out.println("Saldo: " + saldo);
        System.out.println("Conta bloquead? " + (isBloqueado() == true?"Sim":"Não"));*/
    }
    
    //Método para realizar saque na conta do cliente
    public void realizarSaque(){
        if(verificarSenha(0, 2)){
         double vlrSaque = 0;
         vlrSaque = Double.parseDouble(JOptionPane.showInputDialog("Valor a Sacar: "));
         if(vlrSaque >= getSaldo())
             JOptionPane.showMessageDialog(null,"Saldo insuficiente");
         else
            setSaldo(getSaldo()-vlrSaque);

        }
    }
    
    public void realizarDeposito(){
        
            double vlrDeposito = 0;
            vlrDeposito = Double.parseDouble(JOptionPane.showInputDialog("Valor do Deposito: "));
            setSaldo(getSaldo()+vlrDeposito);
            
    }
    
    public void exibirSaldo(){
        if(verificarSenha(0, 2)){
            JOptionPane.showMessageDialog(null,"O saldo atual é: " + getSaldo());
            return;
        }

    }
    
    private boolean verificarSenha(int pwd, int tentativas){
        
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha"));
        
        if(pwd == getSenha()){
            return false;
        }
        else{
            if(tentativas == 0){
                JOptionPane.showMessageDialog(null, "Conta bloqueada");
                setBloqueado(true);
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha Incorreta " + tentativas + " Restantes");
                tentativas--;
                verificarSenha(pwd, tentativas);
            }    
        }
        return true;
    }
    
    public void trocarSenha() {
    // Tentar verificar a senha atual
        
    boolean verificacao = verificarSenha(0, 2);
    System.out.println("Resultado da verificação de senha: " + verificacao); // Adicione um log

    if (verificacao == true) {
        //return // Sai do método se a verificação foi bem-sucedida
    }

        int senhaNova = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova senha: "));
        int confirmSenha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha novamente"));

        if(senhaNova == confirmSenha){
            setSenha(senhaNova);

            JOptionPane.showMessageDialog(null, "A senha foi alterada com sucesso.");

        }else{
            JOptionPane.showMessageDialog(null, "As senhas não conferem");
            trocarSenha();
        }
    
    }
    
    

    
    //Métodos assessores (Sempre colocar no final do código)
    private void setCliente(String cliente){
        this.cliente = cliente;
    }
    private String getCliente(){
        return this.cliente;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    private double getSaldo() {
        return saldo;
    }

     private void setSenha(int senha) {
        this.senha = senha;
    }
    
    private int getSenha() {
        return senha;
    }

    private boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    
    

}//Fim da classe
