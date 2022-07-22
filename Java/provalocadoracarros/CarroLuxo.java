package provalocadoracarros;

public class CarroLuxo extends Carro{
    private int qtdAirBags;
    private String tamanhoPortaMalas;
    private boolean gps;

    public CarroLuxo(int qtdAirBags, String tamanhoPortaMalas, boolean gps, String marca, String modelo,
            String placa, int ano, String cor, double valorAlocacao, boolean disponivel, int cotaRenovacoes, double valorMulta) {
        super(marca, modelo, placa, ano, cor, valorAlocacao, disponivel, 5, valorMulta);
        this.qtdAirBags = qtdAirBags;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.gps = gps;
    }

    public int getQtdAirBags() {
        return qtdAirBags;
    }

    public void setQtdAirBags(int qtdAirBags) {
        this.qtdAirBags = qtdAirBags;
    }

    public String getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(String tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public boolean temGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
    
    
}
