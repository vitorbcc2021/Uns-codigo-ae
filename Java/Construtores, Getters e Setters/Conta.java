package constgettersetter;
public class Conta {
    public String nomeTitular;
    private int numConta;
    private boolean estadoConta;
    private float saldo;
    private char tipo;

    public Conta(){
        this.setEstadoConta(false);
        this.setSaldo(0.0f);
    }
    
    public void abrirConta(char tipoConta, boolean est){
        this.setTipo(tipoConta);
        this.setEstadoConta(est);
        if(tipoConta == 'C'){
            this.setSaldo(50);      //contas corrente começam com 50 reais por padrão
        } else if(tipoConta == 'P'){
            this.setSaldo(150);     //contas poupança começam com 150 reais por padrão
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public  void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Não pode fechar a conta! Você ainda tem dinheiro conosco.");
        } else if(this.getSaldo() == 0){
            this.setEstadoConta(false);
            System.out.println("Conta fechada com sucesso!!");
        } else if (this.getSaldo() < 0){
            System.out.println("Não pode fechar a conta! Você está com saldo negativo.");
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    public int getNumConta(){
        return numConta;
    }
    
    public void setNumConta(int numero){
        this.numConta = numero;
    }
    
    public boolean getEstadoConta(){
        return this.estadoConta;
    }
    
    public void setEstadoConta(boolean est){
        this.estadoConta = est;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public char getTipo(){
        return this.tipo;
    }
    
    public void setTipo(char tipo){
        this.tipo = tipo;
    }
    
    public void depositar(float deposito){
        if (this.getEstadoConta() == true){
            this.saldo += deposito;   
        } else{
            this.saldo = this.getSaldo();
        }
    }
    
    public void sacar(float saque){
        if(this.getEstadoConta() == true){
            if(this.getSaldo() > saque){
                this.setSaldo(this.saldo -= saque);
            } else if(this.getSaldo() == saque){
                this.setSaldo(this.saldo -= saque);
                this.setEstadoConta(false);
            }
        } else {
            System.out.println("Impossível sacar! Conta desativada!");
        }
    }
    
    public void tranferir(float transferencia, Conta conta){
        this.setSaldo(this.saldo -= transferencia);
        conta.setSaldo(conta.saldo += transferencia);
        
    }
    
}
