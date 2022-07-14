using System;

class Aula16
{
    static void Main(string[] args)
    {
        int dividendo;
        int divisor;
        int resto;
        int quociente;
        
        Console.Write("Digite um valor para o dividendo: ");
        dividendo = Convert.ToInt32(Console.ReadLine());  // O metodo Parse dava erro, tive que usar Convert
        Console.Write("Digite um valor para o divisor: ");
        divisor = Convert.ToInt32(Console.ReadLine()); // Int32 = inteiro --- Int64 = long --- Int 16 = short

        quociente = divide(dividendo, divisor, out resto);

        Console.WriteLine("O quociente e: " + quociente);
        Console.WriteLine("O resto e: " + resto);
    }

    static int divide(int dividendo, int divisor, out int resto)
    {
        int quociente = dividendo / divisor;
        resto = dividendo % divisor;
        return quociente;
    }
}
