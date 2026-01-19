package Arrays;

public class Adibideak {
	int [] arr;
	public static void main(String[] args) {
		int[] arr={12, 10, 5, 1, 7, 22};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		for (int i=0; i<arr.length;i++) {
			int aux=arr[i];
			if (arr[i]%2==0) {
				if (i>0) {
					aux=arr[i-1];
				} else {
					aux=arr[i+1];
				}
			}else {
				if (i<arr.length-1) {
					aux=arr[i+1];
				} else {
					aux=arr[i-1];
				}
			}
			System.out.print(aux+"\t");
		}
	}
}
