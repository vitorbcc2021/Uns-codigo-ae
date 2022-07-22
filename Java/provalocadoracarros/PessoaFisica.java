package provalocadoracarros;

public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String cpf, String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    // Metodos Abstratos
    
    @Override
    public boolean verificarDisponibilidade(){
        return super.getQtdEmprestimos() == 0;
    }
}
