package provalocadoracarros;

public class Emprestimo {
    private Cliente cliente;
    private Carro carro;
    private int renovacoes;
    private double dividaTotal;

    
    //  CONSTRUTORES
    
    public Emprestimo(Cliente cl, Carro carro, int renovacoes, double dividaTotal) {
        if(cl.verificarDisponibilidade()){ // Polimorfismo!! Sobreposição de métodos usada de forma correta
            if(carro.isDisponivel()){
                this.cliente = cl;
                this.carro = carro;
                this.renovacoes = renovacoes;
                this.dividaTotal = dividaTotal;
                this.cliente.setQtdEmprestimos(this.cliente.getQtdEmprestimos() + 1);
                this.carro.setDisponivel(false);
            }
            else{
                throw new CarroIndisponivelException("Carro indisponivel para locacao");
            }
        }
        else{
            throw new MaximoEmprestimosException("Voce nao pode realizar mais um emprestimo!");
        }
    }
    
    
    // GETTERS & SETTERS

    public Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    private void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    private void setRenovacoes(int renovacoes) {
        this.renovacoes = renovacoes;
    }
    
    private void addRenovacoes(){
        this.renovacoes++;
    }

    public double getDividaTotal() {
        return dividaTotal;
    }

    private void setDividaTotal(double dividaTotal) {
        this.dividaTotal = dividaTotal;
    }
    
    
    //  METODOS ESPECIAIS DE EMPRESTIMO
    
    public void renovarAluguel(){
        this.addRenovacoes();
        
        if(this.renovacoes > this.carro.getCotaRenovacoes()){
            this.dividaTotal++;
        }
    }
    
    public void devolverCarro(){
        if(this.renovacoes > carro.getCotaRenovacoes()){
            this.setDividaTotal((this.dividaTotal * this.carro.getValorMulta()) + this.carro.getValorAlocacao());
            this.carro.setDisponivel(true);
            System.out.println("Voce deve uma divida de: RS" + this.dividaTotal);
        }
        else{
            this.setDividaTotal(this.carro.getValorAlocacao());
            this.carro.setDisponivel(true);
            System.out.println("Voce deve uma divida de: RS" + this.dividaTotal);
        }
    }
    
    
    
}
