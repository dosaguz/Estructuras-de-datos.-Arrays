package ejercicio6;
import java.util.Random;

public class Ejercicio_6 {
	static int[][] matriz ;
	
	static void rellenarMatriz() {
		matriz = new int[4][4];
		 for (int i = 0; i < 4; i++) {
			 for (int j = 0; j < 4; j++) {
				 matriz[i][j] = (int)(Math.random()*100+0); //de 0 al 99
			 }
		 }
	}
	static void matrizPorFilas() {
		 for (int i = 0; i < 4; i++) {
			 for (int j = 0; j < 4; j++) {
				 System.out.println(matriz[i][j]);
			 }
			 }
	}
	static void matrizPorColumnas() {
		 for (int i = 0; i < 4; i++) {
			 for (int j = 0; j < 4; j++) {
				 System.out.println(matriz[j][i]);
			 }
			 }
	}
	static void matrizPorFilasInvertida() {
		 for (int i = 3; i >= 0; i--) {
			 for (int j = 3; j >=0; j--) {
				 System.out.println(matriz[i][j]);
			 }
			 }
	}
	static void matrizPorColumnasInvertida() {
		 for (int i = 3; i >= 0; i--) {
			 for (int j = 3; j >=0; j--) {
				 System.out.println(matriz[j][i]);
			 }
			 }
	}
	static void matrizDiagonal() {
		for (int i = 0; i < 4; i++) {
			System.out.println(matriz[i][i]);
		}
	}
	
	

	public static void main(String[] args) {
		rellenarMatriz();
		matrizDiagonal();
	}
}
