package provalocadoracarros;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    private int qtdEmprestimos;
    
    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.qtdEmprestimos = 0;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQtdEmprestimos() {
        return qtdEmprestimos;
    }

    public void setQtdEmprestimos(int qtdEmprestimos) {
        this.qtdEmprestimos = qtdEmprestimos;
    }
    
    // Metodos Abstratos
    
    public abstract boolean verificarDisponibilidade();
    
}
