package ordemCrescente;

import java.util.Scanner;

public class ordemCrescente {
	
	public static void main (String args[])
	{
		int num1,num2,num3,aux1,aux2,menor,medio,maior;		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		num1 = leia.nextInt();
		System.out.println("Digite um número:");
		num2 = leia.nextInt();
		System.out.println("Digite um número:");
		num3 = leia.nextInt();
		
		if (num1>=num2 && num1>=num3)
		{
			maior = num1;
			aux1 = num2;
			aux2 = num3;
		}
		else if (num2>=num3 && num2>=num3)
		{
			maior = num2;
			aux1 = num1;
			aux2 =num3;
		}
		else
		{
			maior = num3;
			aux1 = num1;
			aux2 = num2;
		}
		if (aux1>=aux2)
		{
			medio = aux1;
			menor = aux2;
		}
		else
		{
			medio = aux2;
			menor = aux1;
		}
		
		System.out.printf("Os números em ordem crescente são: %d, %d e %d",menor,medio,maior);
		
		
	}

}
