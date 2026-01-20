package UD6_Tanda1;

import Arrays.Kontsola;

public class ZenbakiaAurkitu {

    public static int ZenbakiaAurkitu(int[] arr) {
        System.out.println("Esan zenbaki bat ea sartuta dagoen array-an:");
        int zenb = Kontsola.irakurriInt();
        int beheLim = 0;
        int goiLim = arr.length - 1;
        int posizioa = -1;
        while (beheLim <= goiLim) {
            int erdia = (beheLim + goiLim) / 2;

            if (arr[erdia] == zenb) {
                posizioa = erdia;
                break;
            } else if (arr[erdia] < zenb) {
                beheLim = erdia+1;
            } else {
                goiLim=erdia-1;
            }
        }

        return posizioa;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 10, 12, 22}; 
        int pos = ZenbakiaAurkitu(arr);

        if (pos != -1) {
            System.out.println("Zenbakia aurkitu da posizioan: " + pos);
        } else {
            System.out.println("Zenbakia ez da aurkitu.");
        }
    }
}
