package provalocadoracarros;

public class Empresa extends Cliente{
    private String cnpj;
    private PessoaFisica representante;

    public Empresa(String cnpj, PessoaFisica representante, String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.representante = representante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getRepresentante() {
        return representante;
    }

    public void setRepresentante(PessoaFisica representante) {
        this.representante = representante;
    }

    
    // Metodos Abstratos
    
    @Override
    public boolean verificarDisponibilidade() {
        return true;
    }
    
    
    
}
