package ativedade_erinaldo;

import java.util.Scanner;

public class Carlos26_04 {

	public static void main(String[] args) {
		// poupança = 0,6%; Renda fixa = 1%
		double sal_carlos, sal_joao;
		int meses;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário de Carlos: ");
		sal_carlos = sc.nextDouble();
		
		sal_joao = sal_carlos / 3;
		
		meses = 0;
		
		while (sal_joao < sal_carlos) {
			sal_carlos = sal_carlos + (sal_carlos * (0.6 / 100.0));
			sal_joao = sal_joao + (sal_joao * (1.0 / 100.0));
			meses++;
			System.out.println(meses);
		}
		
		System.out.printf("Levarão %d meses para o Salário de João ultrapassar o de Carlos.", meses);
		
		sc.close();

	}

}
