package paridadePotencia;

import java.util.*;

public class paridadePotencia {
	
	public static void main(String args[])
	{
		int num;
		double aux;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextInt();
		
		if (num%2==0)
		{
			System.out.println("Seu n�mero: "+num+" � par.");
			aux = Math.sqrt(num);
			System.out.printf("A raiz quadrada do seu n�mero �: %2f",aux);
			
		}
		else
		{
			System.out.println("Seu n�mero: "+num+" � �mpar.");
			aux = Math.pow(num, 2);
			System.out.printf("Seu n�mero: %d elevado a 2 �: %2f",num,aux);
		}
	}

}
