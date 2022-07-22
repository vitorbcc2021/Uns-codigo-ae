package provalocadoracarros;

public abstract class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private String cor;
    private double valorAlocacao;
    private boolean disponivel;
    private int cotaRenovacoes;
    private double valorMulta;

    public Carro(String marca, String modelo, String placa, int ano, String cor, double valorAlocacao, boolean disponivel, int cotaRenovacoes, double valorMulta) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.valorAlocacao = valorAlocacao;
        this.disponivel = true;
        this.cotaRenovacoes = cotaRenovacoes;
        this.valorMulta = valorMulta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorAlocacao() {
        return valorAlocacao;
    }

    public void setValorAlocacao(double valorAlocacao) {
        this.valorAlocacao = valorAlocacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getCotaRenovacoes() {
        return cotaRenovacoes;
    }

    public void setCotaRenovacoes(int cotaRenovacoes) {
        this.cotaRenovacoes = cotaRenovacoes;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }
    
    
    
}
