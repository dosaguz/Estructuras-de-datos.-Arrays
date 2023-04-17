package ejercicio4;

public class Ejercicio_4 {
	static String[] prim = {"hola","caracola"};
	static String[] seg = {"hola","caracola"};
	static boolean isLaMismaArray(String[] primera, String[] segunda){
		if(primera.length!=segunda.length)
		return false;
		else  {
			for (int i=0;i<primera.length;i++) {
				if(primera[i]!=segunda[i]) {
					return false;
				}
			}
		}
		return true;	
	}
	
	public static void main(String[] args) {	
		System.out.println(isLaMismaArray(prim, seg));
	}
}
