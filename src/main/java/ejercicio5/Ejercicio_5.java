package ejercicio5;

import java.util.Arrays;

public class Ejercicio_5 {
	static int[] lista = {1,2,3,4,5};
	
	static int[] invertirArray(int[]lista) {
		
		int[] salida = new int [lista.length];
		
		int contador= lista.length-1;
		
		for (int i=0;i<lista.length;i++) {
			salida[i]= lista[contador];
			contador--;
		}
		return salida;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(invertirArray(lista)));
	}

}
