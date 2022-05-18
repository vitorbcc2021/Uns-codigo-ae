package encapsulamento;
public class Encapsulamento {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.mutar();
        c.desmutar();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
        
    }
    
}
