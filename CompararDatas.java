/*/ESTE PROGRAMA COMPARA O PERÍODO DE TEMPO ENTRE DUAS DATAS
ESPECÍFICAS, DIZENDO AO FINAL A DIFERENCA DE TEMPO ENTRE ELAS/*/

import java.util.Scanner;
import java.util.Arrays;
public class CompararDatas
{
	public static void main (String [] args)
	{
		System.out.println("Insira uma data inicial (dd mm aaaa): ");
      
      	int [] dataini = new int [3];
      	dataini = lerLinha(3);
      
      	System.out.println("Insira uma data final (dd mm aaaa): ");
      
      	int [] datafin = new int [3];
      	datafin = lerLinha(3);
      
      	int dias = 0, meses = 0, anos = 0;
      
      	while (true)
      	{
       		if (Arrays.equals(dataini, datafin))
        	{
          		System.out.println("A diferenca eh de " + anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s).");
          		break;
        	}
	      	if (dataini[2] == datafin[2])
	      	{
	         	if (dataini[1] == datafin[1])
	         	{
	            	if (dataini[0] < datafin[0])
	            	{
	               		while (dataini[0] != datafin[0])
	               		{
	                  		dataini[0]++;
	                  		dias++;
	               		}
	            	}
	            	else
	            	{
	               		while (dataini[0] != datafin[0])
	               		{
	                  		dataini[0]--;
	                  		dias--;
	                  		if (dias < 0)
	                  		{
	                    		dias += 30;
	                    		meses--;
	                  		}
	               		}
	            	}
	         	}
	         	else if (dataini[1] < datafin[1])
	         	{
	            	while (dataini[1] != datafin[1])
	            	{
	               		dataini[1]++;
	               		meses++;
	            	}
	         	}
	         	else
	         	{
	            	while (dataini[1] != datafin[1])
	            	{
	                	dataini[1]--;
	                	meses--;
	                	if (meses < 0)
	                	{
	                   		meses += 12;
	                   		anos--;
	                	}
	             	}
	          	}
	      	}
	      	else
	      	{
	        	while (dataini[2] != datafin[2])
	          	{
	            	dataini[2]++;
	            	anos++;
	          	}
	      	}
    	}         
 	}
  
	public static int [] lerLinha (int tamanho)
  	{
    	Scanner leitor = new Scanner (System.in);
    
    	int [] gg = new int [tamanho];
    
    	for (int i = 0; i < tamanho; i++)
    	{
      		gg [i] = leitor.nextInt();
    	}
    
    	return gg;
	} 
}