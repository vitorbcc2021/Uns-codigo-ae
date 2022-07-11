using System;

class Aula13
{
    static void Main(string[] args)
    {
        char[] meuNome = new char[5]{'V', 'i', 't', 'o', 'r'};

        foreach(char letra in meuNome)
        {
            Console.Write(letra);  /* So serve pra leitura de elementos em array...
                                      n funciona pra inserir elementos em vetores
                                      e nem para inserir elementos em matrizes ou ler matrizes  */
        }
        
    }
}
