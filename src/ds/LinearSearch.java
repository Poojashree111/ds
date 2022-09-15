package ds;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= { 4,5,7,8,9,13};
		int item=5;
		int temp=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==item) {
				System.out.println(" the index is.."+i);
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("item is not found in the list");
		}

	}

}
