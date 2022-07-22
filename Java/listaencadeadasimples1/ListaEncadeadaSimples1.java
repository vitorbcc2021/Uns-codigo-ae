package listaencadeadasimples1;

public class ListaEncadeadaSimples1 {
    public static void main(String[] args) {
        ListaLigada listaLig = new ListaLigada();
        Paciente p1 = new Paciente("Vitor", (byte)18, 'M');
        Paciente p2 = new Paciente("Miguel",(byte) 16, 'M');
        Paciente p3 = new Paciente("Andre", (byte)13, 'M');
        Paciente p4 = new Paciente("Sara", (byte)18, 'F');
        Paciente p5 = new Paciente("Andressa",(byte) 23, 'F');
        
        listaLig.adiciona(p1);
        listaLig.adiciona(p3);
        listaLig.adiciona(p5);
        listaLig.adiciona(p2);
        listaLig.adiciona(p4);
        
        for(int i=0; i<listaLig.Tamanho(); i++){
            Paciente pac = (Paciente) listaLig.pega(i);
            System.out.println("Nome: " + pac.getNome() + "\nIdade: " + pac.getIdade() + "\nSexo: " + pac.getSexo() + "\n");
        }
        
        
        
    }

}
