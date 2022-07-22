package fibonacci1;
public class Fibo {
    int termofibo(int x){
        return(x<2?x:termofibo(x-1)+termofibo(x-2));
        //teste?verdade:falso;
        //Operador Ternário
    }
}