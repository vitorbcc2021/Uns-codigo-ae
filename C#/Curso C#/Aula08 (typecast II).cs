using System;

class aula08{
    static void Main(){
        int n1 = 10;
        float n2 = n1;

        Console.WriteLine(n2); // Vai funcionar pois n2 como um float aceita um n1!! mas o contrario nao acontece!!

        // n1 = n2; <--- nao funciona (eu testei isso :P)

        long varLong = 200;
        short varShort = (short) varLong;
        Console.WriteLine(varShort);

        string str = "17";
        //int n3 = (int) str;    NAO funciona!!!!, strings apenas podem ser convertidas com int.Parse() ou Convert.ToInt()
        int n3 = int.Parse(str); // Assim pode! ^-^
        Console.WriteLine(n3);

    }
}
