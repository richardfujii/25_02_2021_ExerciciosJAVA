package maiorNumero;

import java.util.*;

public class maiorNumero {

	public static void main(String[] args) {
		
		int num1,num2,num3,maior;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro n�emro: ");
		num1=ler.nextInt(); 
		System.out.println("Digite o valor do segundo n�emro: ");
		num2=ler.nextInt();
		System.out.println("Digite o valor do terceiro n�emro: ");
		num3=ler.nextInt();
		
		if (num1>=num2 && num1>=num3)
		{
			maior = num1;
		}
		else if (num2>=num1 && num2>=num3)
		{
			maior = num2;
		}
		else
		{
			maior = num3;
		}
		System.out.println("O maior n�mero �: "+maior);

	}

}
