package UD6_Tanda0;

public class Ariketa3 {
	public static String[] arrayMásPoblado (String[] a1, String[] a2) {
		int batura1=contarCaracteres(a1);
		int batura2=contarCaracteres(a2);
		
		if (batura1>batura2) return a1;
		if (batura2>batura1) return a2;
		return null;
		
	}
	
	public static Puntua[] puntuenArrayaSortu(int[] arrX, int[] arrY) {
		if (arrX.length!=arrY.length) return null;
		Puntua[] arrPunt=new Puntua[arrX.length];
		for (int i=0; i<arrPunt.length;i++) {
			arrPunt[i]=new Puntua(arrX[i], arrY[i]);
		}
		return arrPunt;
	}
	
	private static int contarCaracteres(String[] arr) {
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			total=total+arr[i].length();
		}
		return total;
	}
	
	public static void main(String[] args) {
		String[] arr1= {"holita querido " , "mundoooooo"};
		String[] arr2= {"java" , "programación"};
		String[] erantzuna=arrayMásPoblado(arr1, arr2);
		if (erantzuna==null) {
			System.out.println("2 array-ak karaktere kopuru berdina dute");
		} else {
		    for (int i = 0; i < erantzuna.length; i++) {
		        System.out.print(erantzuna[i]);
		    }
		}
		}	
}
