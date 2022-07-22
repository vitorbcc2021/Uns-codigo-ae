package provalocadoracarros;

public class CarroSuv extends Carro{
    private String tamanhoPortaMalas;
    private String tipoTracao;
    private String tipoCombustivel;

    public CarroSuv(String tamanhoPortaMalas, String tipoTracao, String tipoCombustivel, String marca, String modelo, String placa,
            int ano, String cor, double valorAlocacao, boolean disponivel, int cotaRenovacoes, double valorMulta) {
        super(marca, modelo, placa, ano, cor, valorAlocacao, disponivel, 3, valorMulta);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.tipoTracao = tipoTracao;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(String tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    
}
