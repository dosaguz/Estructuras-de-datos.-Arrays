package ejercicio1;

import java.util.Scanner;

public class Ejercicio_1 {
	static int[] num= new int [10];
	
	public static void	pedirValores() {		
		for (int i=0; i<10; i++) {
		System.out.print("Dame un numero: ");
		Scanner sc = new Scanner(System.in);
		int numerito = sc.nextInt();
		num[i] = numerito;
		}
	}
	public static void muestraValores() {
		System.out.println("ÍNDICES  ---   VALORES");
		for (int i=0; i<10; i++) {
		System.out.println(i + "        ->        " + num[i]);
		}
	}
	
	public static void main(String[] args) {
		pedirValores();
		muestraValores();
	}

}
