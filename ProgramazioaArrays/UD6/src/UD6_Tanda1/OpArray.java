package UD6_Tanda1;

import java.util.Arrays;

import Arrays.Kontsola;

public class OpArray {
	int [] arr_zenb;
	static final int[] zenb_debekatu= {0, -1, -999};
	int n=0;
	
	public OpArray() {
		this.arr_zenb = new int[zenb_debekatu.length];
	}
	
	public OpArray(int tam) {
		this.arr_zenb=new int[tam];
	}
	
	public void arrayaIkusi() {
		for (int i = 0; i < n; i++) {
			System.out.print(arr_zenb[i]+"\t");
		}
	}
	public void arrayaKargatu() {
		while (true) {
			System.out.println("Array-a osatzeko zenbakiak sartu:");
			int zenb=Kontsola.irakurriInt();
			if(zenb==0) {
				break;
			}
			
			for (int j = 0; j < zenb_debekatu.length; j++) {
			    if (zenb == zenb_debekatu[j]) {
			        System.out.println("Zenbaki debekatua! Saiatu berriro:");
			        zenb=Kontsola.irakurriInt();
			    }
			}
			
			arr_zenb[n] = zenb;
			n++;
			
		}
		
	}
	

	public static void main(String[] args) {
		OpArray miArray= new OpArray();
		miArray.arrayaKargatu();
		miArray.arrayaIkusi();
		miArray.toString();
		
		
		
	}

	@Override
	public String toString() {
		return "OpArray [arr_zenb=" + Arrays.toString(arr_zenb) + "]";
	}
	
	

	
	
	

}
