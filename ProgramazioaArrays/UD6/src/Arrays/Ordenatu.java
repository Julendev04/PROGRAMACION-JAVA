package Arrays;

public class Ordenatu {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < 5; i++) {
            arr[i] = 10*i;
        }

        int n = 5;
        for (int i = 0; i<5; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("Sartu nahi duzun zenbakia:");
        int zenbakia=Kontsola.irakurriInt();
        int posizioa = PosizioaAtera(arr, zenbakia, n);
        System.out.println("Zenbakia sartu behar den posizioa: " + posizioa);
    }

    public static int PosizioaAtera(int[] arr, int numero, int n) {
        for (int i=0; i<n; i++) {
            if (numero<arr[i]) {
                return i;
            }
        }
        return n;
    }
}

