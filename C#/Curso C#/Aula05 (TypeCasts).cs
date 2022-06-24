using System;

class Aula05
{
    static void Main(string[] args)
    {
        int v1, v2, soma;
        string nome;

        Console.Write("Digite seu nome: ");
        nome = Console.ReadLine();
        Console.Write("Seu nome e: {0, 5}\n", nome);

        Console.WriteLine("Digite um valor: ");
        v1 = int.Parse(Console.ReadLine()); //int.Parse e um metodo de typecast, pois o ReadLine vai receber uma string e o parse ira converter para int

        Console.Write("Digite um valor: ");
        v2 = Convert.ToInt32(Console.ReadLine()); //Convert.ToInt32 e um metodo de typecast igual o int.Pase!

        soma = v1 + v2;

        Console.WriteLine("A soma de {0} com {1} e: {2}", v1, v2, soma);

    }
}
