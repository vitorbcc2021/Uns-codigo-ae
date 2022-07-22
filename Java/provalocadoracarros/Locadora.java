package provalocadoracarros;

import java.util.ArrayList;

public class Locadora {
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Carro> carros;

    
    // Construtores
    public Locadora(String nome, String endereco, String telefone, ArrayList<Carro> carros) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carros = carros;
    }

    public Locadora(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carros = new ArrayList<Carro>();
    }

    
    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarrosDisponiveis(ArrayList<Carro> carrosDisponiveis) {
        this.carros = carrosDisponiveis;
    }
    
    public Carro getCarrosDisponiveis(Carro carro){
        return this.carros.get(this.carros.indexOf(carro));
    }
    
    public boolean addCarrosDisponiveis(Carro carroDisponivel){
        return this.carros.add(carroDisponivel);
    }
    
    public boolean removeCarrosDisponiveis(Carro carroDisponivel){
        Carro carro = this.carros.get(this.carros.indexOf(carroDisponivel));
        carro.setDisponivel(false);
        return true;
    }
}
