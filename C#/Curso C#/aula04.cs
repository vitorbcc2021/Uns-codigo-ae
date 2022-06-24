using System;

class aula04{
    static int x = 2; // Isto nao e uma constante, e uma Variavel Global!!!

    static void Main(string[] args)
    {
        const string nome = "Vitor"; // Const significa constante
        const double pi = 3.1415;

       // nome = "Douglas"; // Da um Erro!!! pois nome e uma constante, e nao uma variavel cujo valor VARIA

        Console.WriteLine("O nome e: {0}\nPi = {1}", nome, pi);


    }
}