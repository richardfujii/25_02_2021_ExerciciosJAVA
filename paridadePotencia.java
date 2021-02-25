package paridadePotencia;

import java.util.*;

public class paridadePotencia {
	
	public static void main(String args[])
	{
		int num;
		double aux;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if (num%2==0)
		{
			System.out.println("Seu número: "+num+" é par.");
			aux = Math.sqrt(num);
			System.out.printf("A raiz quadrada do seu número é: %2f",aux);
			
		}
		else
		{
			System.out.println("Seu número: "+num+" é ímpar.");
			aux = Math.pow(num, 2);
			System.out.printf("Seu número: %d elevado a 2 é: %2f",num,aux);
		}
	}

}
