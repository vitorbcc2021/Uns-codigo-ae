using System;

class Aula06{
    static void Main(){
        /**
         *   Esta aula é sobre Bitwise!!!
         *   Basicamente: se para a esquerda (<<) o valor dobra!
         *   Se para a direita (>>) divide por 2!
         **/


        int num = 10;

        Console.WriteLine("O valor original: " + num);

        //  Modificando num usando o Bitwise:

        num = num << 1; // Vai dobrar 1 vez!!!
        Console.WriteLine("Num e: " + num);

        num = 10; // Resetei o valor apenas para testa-lo novamente!

        num = num << 4; // Vai dobrar 4 vezes!!!
        Console.WriteLine("Num e: " + num);

        num = num >> 2; // Vai dividir por 2 duas vezes!!!O resultado DEVE ser 40!
        Console.WriteLine("Num e: " + num);

    }
}
