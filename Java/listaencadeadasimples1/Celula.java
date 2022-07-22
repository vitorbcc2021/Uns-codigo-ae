package listaencadeadasimples1;

public class Celula { //Essa classe tem como funcao Estruturar As Partes da Celula
    private Celula Proxima;
    private Object Elemento;
    
    //Construtores
    public Celula(Celula proxima, Object paciente){
        this.Proxima = proxima;
        this.Elemento = paciente;
    }

    public Celula(Object elemento){
        this.Elemento = elemento;
    }
    
    
    
    //Ponteiros e referencias
    public void setProxima(Celula proxima){
        this.Proxima = proxima;
    }
    
    public Celula getProxima(){
        return(this.Proxima);
    }
    
    public Object getElemento(){
        return(this.Elemento);
    }
}
