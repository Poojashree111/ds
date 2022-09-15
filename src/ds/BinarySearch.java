package ds;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,5,34,56,7,8,9};
		int srch=2;
		int l=0;
		int h=a.length-1;
		int m=(l+h)/2;
		while(l<=h) {
			if(a[m]==srch) {
				System.out.println("element is present is our arr list.."+m+"..index position");
				break;
			}
			else if(a[m]<srch) {
				l=m+1;
			}
			else {
				h=m-1;
			}
			m=(l+h)/2;
		}
		if(l<h) {
			System.out.println("not found");
		}
	
	}

}
