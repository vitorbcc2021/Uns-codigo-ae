using System;

class Aula12
{
    static void Main(string[] args)
    {
        int[,] matriz = new int[3,3];
        int[,] matriz2 = new int[3,3];
        int[,] resultado = new int[3,3];


        Console.WriteLine("De entrada para os valores da matriz 1: ");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i,j] = int.Parse(Console.ReadLine());
            }
        }

        Console.WriteLine("De entrada para os valores da matriz 2: ");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz2[i,j] = int.Parse(Console.ReadLine());
            }
        }

        Console.WriteLine("\n############ Matriz 1 ############");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                Console.Write(matriz[i, j] + " ");
            }
            Console.WriteLine();
        }

        Console.WriteLine("\n############ Matriz 2 ############");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                Console.Write(matriz2[i, j] + " ");
            }
            Console.WriteLine();
        }

        Console.Write("\n\nEscolha uma operacao aritmetica para realizar com as matrizes:\n"
                    + "a - soma\nb - subtracao\nc - multiplicacao\nEscolha: ");
        char escolha = char.Parse(Console.ReadLine());

        switch(escolha){
            case 'a':
                Console.WriteLine("\n############ Soma ############");

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        resultado[i,j] = matriz[i,j] + matriz2[i,j];
                    }
                }

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        Console.Write(resultado[i, j] + " ");
                    }
                    Console.WriteLine();
                }
                break;

            case 'b':
                Console.WriteLine("\n############ Subtracao ############");

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        resultado[i,j] = matriz[i,j] - matriz2[i,j];
                    }
                }

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        Console.Write(resultado[i, j] + " ");
                    }
                    Console.WriteLine();
                }
                break;

            case 'c':
                Console.WriteLine("\n############ Multiplicao ############");

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        resultado[i,j] = 0;
                        for(int k=0; k<3; k++){
                            resultado[i,j] += matriz[i,k] * matriz2[k,j];
                        }
                    }
                }

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        Console.Write(resultado[i, j] + " ");
                    }
                    Console.WriteLine();
                }
                break;

            default:
                    Console.WriteLine("Voce nao escolheu uma operacao valida!");
                    break;
        }
        
    }
}
