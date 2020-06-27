/*
Problema 1008 - URI
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número 
e o salário do funcionário, com duas casas decimais.
*/

import java.util.Scanner;
public class Salario
{
	public static void main (String [] args)
	{
		Scanner leitor = new Scanner (System.in);

        int num = leitor.nextInt(), horas = leitor.nextInt();
        double valor = leitor.nextDouble();

        System.out.printf ("NUMBER = %d\nSALARY = U$ %.2f\n", num, (horas * valor));
	}
}