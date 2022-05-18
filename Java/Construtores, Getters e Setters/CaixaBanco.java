package constgettersetter;
import java.util.Scanner;
public class ConstGetterSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        System.out.print("Digite quanto deseja depositar: ");
        float deposito = sc.nextFloat();
        
        c1.setNomeTitular("Vitor");
        c1.setNumConta(1400);
        c1.abrirConta('P', true);
        c1.depositar(deposito); //testei se dava para o usuario dar entrada em um método, e funcionou muito bem ^-^
        c1.sacar(30.6f);
        
        c2.setNomeTitular("Vitoria");
        c2.setNumConta(7540);
        c2.abrirConta('C', true);
        
        c1.tranferir(400, c2);
        
//        c1.sacar(c1.getSaldo());
//        c1.fecharConta();
        
        System.out.println("\n-----------------------------------------------");
        System.out.println("Nome: " + c1.getNomeTitular());
        System.out.println("Numero: " + c1.getNumConta());
        System.out.println("Tipo: " + c1.getTipo());
        System.out.println("Estado: " + c1.getEstadoConta());
        System.out.println("Saldo: " + c1.getSaldo());
        
        System.out.println("\n-----------------------------------------------");
        System.out.println("Nome: " + c2.getNomeTitular());
        System.out.println("Numero: " + c2.getNumConta());
        System.out.println("Tipo: " + c2.getTipo());
        System.out.println("Estado: " + c2.getEstadoConta());
        System.out.println("Saldo: " + c2.getSaldo());
    }
    
}
