package fatorial1;
public class FAT {
    int calcfat(int x){
        if(x == 0){
            return 1;//Caso Trivial
        }
        return(x*calcfat(x-1));//Regra Geral
    }
}