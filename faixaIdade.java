package faixaIdade;

import java.util.Scanner;

public class faixaIdade {
	public static void main(String args[])
	{
		int idade; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Voc� � infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Voc� � juvenil");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("Voc� � adulto");
		}
		else
		{
			System.out.println("Idade inv�lida");
		}
		
	}
	
}
