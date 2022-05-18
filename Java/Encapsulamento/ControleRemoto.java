package encapsulamento;
public class ControleRemoto implements Controlador {
    private boolean tocando;
    private boolean ligar;
    private int volume;
    
    //Método Construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligar = false;
        this.tocando = false;
    }

    //Métodos Getters e Setters
    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean getLigar() {
        return ligar;
    }

    private void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }
    
    //Métodos Abstratos

    @Override
    public void ligar() {
        this.setLigar(true);
    }

    @Override
    public void desligar() {
        this.setLigar(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.getLigar());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nF E C H A D O");
    }

    @Override
    public void maisVolume() {
        if(this.getLigar()){
            this.setVolume(this.getVolume()+1);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigar()){
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void mutar() {
        if(this.getLigar() && this.getVolume() > 0){
            this.setVolume(0);
        }
        
    }

    @Override
    public void desmutar() {
        if(this.getLigar() && this.getVolume() == 0){
            this.setVolume(10);
        }
    }

    @Override
    public void play() {
        if(this.getLigar() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigar() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
    
}
