using System;

class aula09{
    static void Main(){
        int escolha;

        Console.WriteLine("Goiania/Goias a Brasilia/DF");
        Console.WriteLine("1 - Aviao\n2 - Carro\n3 - Onibus");
        
        escolha = int.Parse(Console.ReadLine());

        switch(escolha){

            case 1 :
                Console.Write("Voce levara 480 minutos para chegar ate Brasilia/DF");
                break;

            case 2 :
                Console.Write("Voce levara 700 minutos para chegar ate Brasilia/DF");
                break;

            case 3 :
                Console.Write("Voce levara 1000 minutos para chegar ate Brasilia/DF");
                break;

            default:
                Console.Write("Voce nao fez uma escolha valida!!");
                break;

        }
    }
}