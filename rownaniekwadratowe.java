package com.marekm.rownaniekwadratowe;

import java.util.Scanner;

public class rownaniekwadratowe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To jest program rozwiazujacy rownanie kwadratowe");
		System.out.println("Podaj a");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		System.out.println("Podaj b");
		double b = scanner.nextDouble();
		System.out.println("Podaj c");
		double c = scanner.nextDouble();
		double potega = Math.pow(b, 2);
		double delta = potega - 4 * a * c;
		double pierwiastek = Math.sqrt(delta);
		double x = -1 * b / (2 * a);
		double x1 = (-1 * b + pierwiastek) / 2 * a;
		double x2 = (-1 * b - pierwiastek) / 2 * a;
		if(delta < 0)
			{System.out.println("Delta jest ujemna wiec rownanie nie ma rozwiazan");}
		if(delta == 0)
			{System.out.println("Delta jest rowna zero wiec rownanie ma jedno rozwiazanie");
			System.out.println("x=" + x);}
		if(delta > 0)
			{System.out.println("Delta jest wieksza od zera wiec rownanie ma dwa rozwiazania");
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);}
	}

}
