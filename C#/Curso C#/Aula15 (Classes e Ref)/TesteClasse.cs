using System;

class TesteClasse
{
    private int numero;

    public int getNumero()
    {
        return this.numero; // O 'this' funciona apenas em uma classe... Na 'Main' não funciona!
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }
}
