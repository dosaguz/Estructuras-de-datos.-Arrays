package ejercicio3;

public class Ejercicio_3 {
	static int[] prim = {1,2,3,5};
	static int[] seg = {1,2,4};
	static boolean isLaMismaArray(int[] primera, int[] segunda){
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
