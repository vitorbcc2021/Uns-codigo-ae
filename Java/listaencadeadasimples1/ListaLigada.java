package listaencadeadasimples1;

public class ListaLigada implements NewInterface { //Essa classe tem como funcao gerenciar o funcionamento da lista
    private Celula Primeira;
    private Celula ultima;
    private int TotaldeElementos = 0;

    
    //Adiciona no comeco da lista
    private void AdicionaNoComeco(Object paciente){
        Celula nova = new Celula(this.Primeira, paciente);  /*  Passa o espaço vazio alocado da celula Primeira, e o paciente que
                                                                quero adicionar, assim, atribuindo este espaço vazio alocado
                                                                a 'Proxima' e guardando o endereço em que paciente foi guardado em 'Elemento'
                                                                Obs: um objeto ja e uma alocacao de memoria, e posso criar diversos objetos exatamente
                                                                iguais em todos os aspectos, mas eles nunca terao o mesmo endereço, portanto, um
                                                                nunca irá sobrescrever o outro  */
    
        
        this.Primeira = nova;   /* Preenche o atributo vazio Primeira com o objeto
                                   'nova', assim, guardando sempre o espaço alocado
                                    com o paciente inserido */
    
        
        if(this.TotaldeElementos == 0){
            this.ultima = this.Primeira; /* A 'ultima' vai receber o espaço alocado
                                           (agora preenchido) da 'primeira', afinal,
                                           não tenho nenhum outro elemento alem do primeiro,
                                           logo, o primeiro e o ultimo são exatamente a mesma coisa!   */
        }
    
        this.TotaldeElementos++; // Soma um elemento na lista
    }
    
    
    //Adiciona um novo elemento
    @Override
    public void adiciona(Object elemento){
        if(this.TotaldeElementos == 0){
            this.AdicionaNoComeco(elemento);
        }
        else{
            Celula nova = new Celula(elemento); 
            this.ultima.setProxima(nova); /*    Vai modificar 'Proxima' para atribuir o espaço que esta
                                                alocado para o novo elemento inserido a ela. Antes 'Proxima'
                                                armazenava o elemento(paciente) da posicao N-1, e agora ira
                                                armazenar o novo elemento inserido da posicao N */
            
            
            this.ultima = nova; /*  Vai armazenar o ultimo elemento inserido, ou seja,
                                    toda vez que eu inserir um elemento a variavel ultima
                                    ira receber o espaço alocado do ultimo elemento que eu
                                    inseri, deste modo, eu terei sempre guardado o objeto do
                                    início e do final da lista, logo, tenho um inicio e um fim sempre! */
            
            
            this.TotaldeElementos++;
        }
    }
    
    
    //Adiciona numa posição específica da lista
    @Override
    public void adiciona(int pos, Object elemento){
        if(pos == 0){
            this.AdicionaNoComeco(elemento);
        }
        else if(pos == this.TotaldeElementos+1){
            this.adiciona(elemento);
        }
        else {
            Celula anterior = this.PegaCelula(pos-1);   //  Resgata o elemento da posicao anterior
            
            
            Celula Nova = new Celula(anterior.getProxima(), elemento);  /*  A celula 'Nova' vai conter basicamente, o endereço da
                                                                            celula que vem após ela e seu elemento proprio. Como Listas Ligadas nao trabalham exatamente
                                                                            com índices, ao apontar para o proximo elemento com esse meu novo objeto,
                                                                            é como se eu estivesse empurrando o objeto 'anterior' para frente(posicao 8)*/
            
            anterior.setProxima(Nova);  /*  Aqui eu corrijo o "ponteiro" 'Proxima' da minha posicao
                                            anterior para apontar para o novo endereco desta posicao    */
            this.TotaldeElementos++;
        }
    }
    
    
    //Posicao
    private boolean PosicaoOcupada(int pos){
        return (pos >= 0)&&(pos < this.TotaldeElementos);
    }
    
    
    //Pega uma celula de uma posicao
    private Celula PegaCelula(int pos){
        if(!this.PosicaoOcupada(pos)){  /*  Se for diferente de uma posicao ocupada, ira retornar
                                            um erro e dizer que a posicao nao existe */
            
            throw new IllegalArgumentException("Posicao nao Existe");
        }
        else{
            Celula atual = this.Primeira;   //  Vai pegar a posicao da 'Primeira'
            
            for(int i=0; i < pos; i++){     //  A partir da primeira posicao, ira percorrer ate a posicao 'pos'
                
                atual = atual.getProxima(); //  vai percorrendo ate pegar a ultima posicao da 'Primeira' ate 'pos'
            }
            
        return(atual);  // vai retornar o objeto encontrado no nosso laco
        }
    }
    
    
    //Pega um objeto da lista
    @Override
    public Object pega(int posicao){
        return(this.PegaCelula(posicao).getElemento());
    }
    
    
    //Remove do comeco da lista
    private void removeDoComeco(int pos){
        if(!this.PosicaoOcupada(pos)){
            throw new IllegalArgumentException("Posição não Existe");
        }
        else{
            this.Primeira = this.Primeira.getProxima();
            this.TotaldeElementos--;
            if(this.TotaldeElementos == 0){
                this.ultima = null;
            }
        }
    }
    
    
    //Verifica se um elemento está na lista
    @Override
    public boolean Contem(Object elemento){
        Celula atual = this.Primeira;
        while(atual!=null){
            if(atual.getElemento().equals(elemento)){
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }
    
    
    //Verifica o tamanho da lista
    @Override
    public int Tamanho(){
        return(this.TotaldeElementos);
    } 
    
    
}
