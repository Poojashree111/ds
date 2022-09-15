package ds;

public class Selection {
	public static void selectionSort(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int smallerNumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallerNumber;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {0,12,14,34,52,2,12};
		System.out.println("\nBefor selection sort");
		for(int i:arr1) {
			System.out.println(i+" ");
		}
		System.out.println();
		selectionSort(arr1);
		System.out.println("\nAfter selection sort");
		for(int i:arr1) {
			System.out.print(i+"  ");
			
		}

	}

}
