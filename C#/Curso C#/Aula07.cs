using System;

class Aula07
{

    enum diasSemana{Domingo, Segunda, Terca, Quarta, Quinta, Sexta, Sabado};

    static void Main()
    {
        diasSemana ds = diasSemana.Sexta;
        Console.WriteLine(ds);

        diasSemana dsem = (diasSemana)3; // Vai pegar elemento da terceira posicao do enum (quarta)
        Console.WriteLine(dsem);

        int diasS = (int) diasSemana.Sabado; // Nao sei pq o TypeCast funcionou aqui... Mas ele retorna o Indice!
        Console.WriteLine(diasS);
    }
}