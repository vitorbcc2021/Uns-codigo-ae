using System;

class aula03{
    static void Main(string[] args)
    {
        int n1, n2, n3;

        n1 = 10; n2 = 20; n3 = 30; // Posso colocar coisas depois do --->  ;

        Console.WriteLine("n1 = {0}\nn2 = {1}\nn3 = {2}", n1, n2, n3); /*   Ele identifica cada indice de acordo com o que foi
                                                                            passado depois da virgula apos fechar as aspas  */

        Console.WriteLine("n1 = %d", n1); // Nao funciona :(

        Console.WriteLine("n1 =\t{0}\nn2 =\t{1}\nn3 =\t{2}", n1, n2, n3); // o \t faz um espaçamento igual o de um Tab

        Teste01();

    }

    static void Teste01(){
        double valorCompra = 5.5;
        double valorVenda;
        double lucro = 0.1;
        string produto = "pastel";

        valorVenda = valorCompra + (valorCompra * lucro);

        Console.WriteLine("Produto.......:{0,15}", produto); /* Este array e para colocar 15 espacos entre a
                                                                string produto e a variavel produto */

        Console.WriteLine("Val.Compra....:{0,15:c}", valorCompra); /*   Este :c serve para colocar o R$ na variavel
                                                                        (de alguma forma ele sabe q sou brasileiro,
                                                                        mas se fosse nos eua este valor com cts seria US$)  */

        Console.WriteLine("Lucro.........:{0,15:p}", lucro);    //Este :p transforma aquele valor em uma porcentagem

        Console.WriteLine("Val.Venda.....:{0,15:c}", valorVenda); // :c coloca o R$

    }
}
