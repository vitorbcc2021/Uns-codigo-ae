package testepilhas;

import java.util.Stack; //permite trabalhar com pilhas

public class TestePilhas {
    public static void main(String[] args) {
        /* objeto.pop()              ->  Remove o que está no topo da lista e o retorna. Ocorre erro se a pilha estiver vazia
           objeto.push(parametro)    ->  Adiciona o que foi passado como parametro no topo da pilha
           objeto.search(parametro)  ->  Procura em qual posicao esta o item, comecando a contar a partir do topo
           objeto.empty()            ->  Verifica se a pilha esta vazia, se estiver retorna true, se nao estiver retorna false
           objeto.peek()             ->  Retorna o que esta no topo da lista. Ocorre erro se a pilha estiver vazia
        */
       
        Stack<String> nome = new Stack<String>();
        
        if(nome.empty()){
            System.out.println("Esta vazio!");
        } else{
            System.out.println("Não esta vazio!");
        }
        
        nome.push("Adalberto");
        nome.push("Claudete");
        nome.push("Vespaziana");
        nome.push("Geralda");
        nome.push("Enzo");
        nome.push("Valentina");
        nome.push("Adamastor");
        
        System.out.println(nome.peek());
        
        // Armazenando em uma variável:
        
        String var1 = nome.peek();
        
        System.out.println("O ultimo item e: " + var1);
        
        // Retirando o que esta no topo e imprimindo o ultimo elemento:
        
        System.out.println(nome.pop());  /* obs: aqui eu usei o .pop() apenas para retornar o valor da
                                            ultima posicao para o sout, ele utilizado daquela forma não
                                            irá modificar a pilha */
        
        // Mostrando a posição do elemento em relação ao topo:
        
        System.out.println(nome.search("Geralda")); //como o metodo pop anterior n removeu nada, geralda esta na posicao 3 em relacao a Adamastor
        
        nome.pop();
        
        System.out.println(nome.search("Geralda")); //agora sim está na posição 2, em relação a Valentina (adamastor removido)
        
        if(nome.empty()){
            System.out.println("Esta vazio!");
        } else{
            System.out.println("Nao esta vazio!");
        }
        
        Stack<Integer> numeros = new Stack<Integer>();
        
        numeros.push(123);
        numeros.push(469);
        numeros.push(777);
        
        int var2 = numeros.peek();
        
        System.out.println("o valor de var2 e: " + var2);
    }
    
}
