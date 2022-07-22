package provalocadoracarros;

public class CarroPopular extends Carro{
    private boolean arCondicionado;

    public CarroPopular(boolean arCondicionado, String marca, String modelo, String placa, int ano, String cor,
            double valorAlocacao, boolean disponivel, int cotaRenovacoes, double valorMulta) {
        super(marca, modelo, placa, ano, cor, valorAlocacao, disponivel, 1, valorMulta);
        this.arCondicionado = arCondicionado;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
    
    
    
    
}
