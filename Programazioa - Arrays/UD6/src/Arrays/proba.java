package Arrays;

public class proba {
	public static void main(String[] args) {
		
		//int[] arr= {12,54, 65, 78, 90, 34, 56}; 
		//for (int i = 0; i < arr.length; i++){ 
			//System.out.println("Sartu "+(i+1)+". zenbakia");
			//arr[i]=Kontsola.irakurriInt(); } 
		//for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]+"\t"); 
		//}
		 
		int[] arr;
		System.out.println("Sartu array-aren tamaina");
		int tam=Kontsola.irakurriInt();
		arr=new int[tam];
		//int[] arr=new int[Kontsola.irakurriInt()];
		
		for (int i = 0; i < arr.length; i++) {
			//Erabiltzaileak nahi dituen balioekin bete
			System.out.println("Sartu "+(i+1)+". zenbakia");
			arr[i]=Kontsola.irakurriInt();
		}

		for (int i = 0; i < arr.length; i++) {
			//Array-a erakusteko
			System.out.println(arr[i]+"\t");
		}
		
		int batura=0;
		int batazbestekoa=0;
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				max=arr[i];
			} else {
				max=arr[0];
			}
			batura=batura+arr[i];
			batazbestekoa=batura/arr.length;
		}
		
		for (int y = arr.length-1; y < 0; y--) {
			System.out.println(arr[y]+"\t");
			
		}
		System.out.println("Arrayaren barneko zenbakien batazkestekoa = "+(double)batazbestekoa);
		System.out.println("Arrayaren barneko zenbakien maximoa = "+max);
	}
}
