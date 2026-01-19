package Arrays;

import java.util.Iterator;

public class ArrayaBeteGabe {
	
	public static int elementuaEzabatu(int[] arr, int n) {
		System.out.println("Array-ko zer posizio ezabatu nahi duzu? [1-"+n+"]");
;		int pos=Kontsola.irakurriInt();
		for(int i=pos;i<n;i++) {
			arr[i-1]=arr[i];
		}
		n--;
		return n;
	}
	
	public static void elementuakSartu(int[] arr, int n) {
		System.out.println("Arrayko ze posiziotan sartu nahi duzu ");
	}
	public static void main(String[] args) {
		int[] arr=new int[10];
		int n=0;
		for(int i=0;i<5;i++) {
			arr[i]=10+10*i;
			n++;
		}
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		arr[n]=60;
		n++;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
