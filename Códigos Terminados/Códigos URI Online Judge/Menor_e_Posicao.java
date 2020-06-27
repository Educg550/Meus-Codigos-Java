/*
Problema 1180 - URI
Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N]. 
A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor 
e a sua posição dentro do vetor, mostrando esta informação.
*/

import java.util.Scanner;
public class Menor_e_Posicao
{
    public static void main (String [] args)
	{
		Scanner leitor = new Scanner (System.in);

        System.out.println ("Insira o valor N: ");
        int [] n = new int [leitor.nextInt()];

        int menor = 0, posicao = 0;

        for (int i = 0; i < n.length; i++)
        {
            n[i] = leitor.nextInt();

            if (i == 0)
            {
                menor = n[i];
                posicao = i;
            }
            else if (n[i] < menor)
            {
                menor = n[i];
                posicao = i;
            }
        }

        System.out.printf ("Menor valor: %d\nPosicao: %d", menor, posicao);
	}
}