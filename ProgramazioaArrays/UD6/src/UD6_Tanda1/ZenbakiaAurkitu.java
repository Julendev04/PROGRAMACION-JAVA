package UD6_Tanda1;

import java.util.Iterator;

import Arrays.Kontsola;

public class ZenbakiaAurkitu {
	public static int ZenbakiaAurkitu(int[] arr) {
		System.out.println("Esan zenbaki bat ea sartuta dagoen array-an");
		int zenb=Kontsola.irakurriInt();
		int posizioa=-1;
		int beheLim=0;
		int goiLim=arr.length-1;
		int erdia=(beheLim+goiLim)/2;
		
		while(posizioa==-1 && erdia!=zenb) {
			if (erdia<zenb) {
				beheLim=erdia;
				goiLim=arr.length-1;
			} else if (erdia>zenb) {
				beheLim=0;
				goiLim=erdia;
			} else {
				posizioa=1;
			}
		}
		
		return posizioa;
	}
	
	public static void main(String[] args) {
		int[] arr={12, 10, 5, 1, 7, 22};
		ZenbakiaAurkitu(arr);
	}
	
}