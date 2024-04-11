package ativedade_erinaldo;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		
		System.out.println(num1 + "" + num2 + "");
		
		int cont = 3;
		
		System.out.println("Digite o número de vezes que a sequência será repetida");
		int stop = sc.nextInt();
		
		while(cont <= stop) {
			int res = num1 + num2;
			System.out.println(res + "");
			
			num1 = num2;
			num2 = res;
			cont++;
		}
		sc.close();

	}

}
