/*/ESTE PROGRAMA CALCULA O TROCO QUE DEVERÁ SER FORNECIDO AO
CLIENTE QUE PAGA UM PRODUTO COM CERTA QUANTIA EM DINHEIRO, 
INFORMANDO AO USUÁRIO O NÚMERO DE CÉDULAS E MOEDAS DEVOLVIDAS/*/

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
			System.out.println ("O cliente nao pagou a quantia necessaria!")
		}
		else
		{
			while (pago >= 100)
			{
				//RETOMAR DAQUI//
			}
		}
	}
}