package listaencadeadasimples1;

public class Paciente {
    private String Nome;
    private byte Idade;
    private char Sexo;

    public Paciente(String Nome, byte Idade, char Sexo) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public byte getIdade() {
        return Idade;
    }

    public void setIdade(byte Idade) {
        this.Idade = Idade;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    
    
    
}
