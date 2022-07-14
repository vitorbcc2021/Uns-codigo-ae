using System;

class Aula15
{
    static void Main(string[] args)
    {
        int num = 10;

        dobraValor(ref num);/*  Ele esta passando uma REFERENCIA para num...
                                Funciona +/- igual a passagem de ponteiros por parametros!! 
                                No Java, não existe passagem de parametros por referencia!
                                Mas no C, C++ e C#, essa possibilidade existe!!  */

        Console.WriteLine(num);

        TesteClasse tc = new TesteClasse();

        tc.setNumero(14);

        Console.WriteLine("O numero do objeto tc e: {0}", tc.getNumero());

        int numeroClasse = tc.getNumero();

        dobraValor(ref numeroClasse);

        tc.setNumero(numeroClasse);

        Console.WriteLine("O numero de tc modificado e: {0}", tc.getNumero());

    }

    static int dobraValor(ref int valor) // O tipo de parametro que vou passar deve ser do tipo referencia
    {
        return valor*=2;/*  No C# funciona multiplicacao e atribuicao... Isso é demais!!
                            Tambem funciona para divisao e atribuicao                       */
    }

}
