/*ESTE PROGRAMA CALCULA O TROCO QUE DEVERA SER FORNECIDO AO
CLIENTE QUE PAGA UM PRODUTO COM CERTA QUANTIA EM DINHEIRO, 
INFORMANDO AO USUARIO O NUMERO DE CEDULAS E MOEDAS DEVOLVIDAS*/

import java.util.Scanner;
public class Troco
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println ("Insira o valor do produto (EX: 10.00): ");
		float valor = sc.nextFloat();

		System.out.println ("Insira o valor pago pelo cliente (EX: 15.00): ");
		float pago = sc.nextFloat();

		if (pago < valor)
		{
			System.out.println ("O cliente nao pagou a quantia necessaria!");
		}
		else
		{
			//CONTAGEM DO TROCO E ARMAZENAMENTO DO NUMERO DE CEDULAS E MOEDAS NO ARRAY "troco" (cedulas na linha 0 e moedas na linha 1)
			int[][] troco = new int[2][6];

			while (pago - 100 >= valor)
			{
				troco [0][0]++;
				pago -= 100;
			}
			while (pago - 50 >= valor)
			{
				troco [0][1]++;
				pago -= 50;
			}
			while (pago - 20 >= valor)
			{
				troco [0][2]++;
				pago -= 20;
			}
			while (pago - 10 >= valor)
			{
				troco [0][3]++;
				pago -= 10;
			}
			while (pago - 5 >= valor)
			{
				troco [0][4]++;
				pago -= 5;
			}
			while (pago - 2 >= valor)
			{
				troco [0][5]++;
				pago -= 2;
			}
			while (pago - 1 >= valor)
			{
				troco [1][0]++;
				pago -= 1;
			}
			while (pago - 0.5 >= valor)
			{
				troco [1][1]++;
				pago -= 0.5;
			}
			while (pago - 0.25 >= valor)
			{
				troco [1][2]++;
				pago -= 0.25;
			}
			while (pago - 0.1 >= valor)
			{
				troco [1][3]++;
				pago -= 0.1;
			}
			while (pago - 0.05 >= valor)
			{
				troco [1][4]++;
				pago -= 0.05;
			}
			while (pago - 0.01 >= valor)
			{
				troco [1][5]++;
				pago -= 0.01;
			}

			for (int i = 0; i < 2; i++)
			{
				for (int j = 0; j < 6; j++)
				{
					//RETOMAR DAQUI
				}
			}
		}
	}
}