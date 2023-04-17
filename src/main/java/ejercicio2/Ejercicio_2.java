package ejercicio2;

import java.util.Scanner;

public class Ejercicio_2 {
	static int[] num;
	
	public static void	pedirTamanoArray() {		
		System.out.print("Dame el tamaño del array: ");
		Scanner sc = new Scanner(System.in);
		int numerito = sc.nextInt();
		num = new int[numerito];
		}
	public static void rellenarArray() {
		for (int i=0; i<num.length; i++) {
		int aleatorio = (int)(Math.random()*10+0);
		num[i] = aleatorio;
		}
	}
	public static void muestraValores() {
		System.out.println("ÍNDICES  ---   VALORES");
		for (int i=0; i<num.length; i++) {
		System.out.println(i + "        ->        " + num[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pedirTamanoArray();
		rellenarArray();
		muestraValores();
	}

}
