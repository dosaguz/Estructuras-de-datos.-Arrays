package ejercicioArrays11_05;

import java.util.Scanner;

//Crear la clase TestArray que contenga una constante entera de valor 5, pida al usuario que inserte el numero de elementos dado por la constante y 
	//lo guarde en un array, al finalizar debe de mostrar el array por pantalla
public class TestArray {
	   //crear una constante
	final static int CONSTANTE = 5;
	
	   //crear un array del tamaño de la constante
	  static int[] listaNum = new int[CONSTANTE];
		

	   //pedir al usuario que inserte el numero de elementos segun la constante
		public static void	insertarElementos() {	
			for(int i=0;i<5;i++) {
			System.out.print("Dame el numeritos para el array jefe: ");
			Scanner sc = new Scanner(System.in);
		//meter los elementos en el array
			int numerito = sc.nextInt();
			listaNum[i] = numerito;
				}
			}
	   

	   //mostrar el array entero por pantalla
		public static void main(String[] args) {
			insertarElementos();
			 System.out.println("Array introducido:");
		      for (int i = 0; i < CONSTANTE; i++) {
		         System.out.print(listaNum[i] + " ");
		         // el nano
		         if(listaNum[i]==33); 
		         System.out.println("Como que 33?");
		      }
		}
}
