package ds;

public class Binary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"m","n","p","q"};
		String srch="q";
		int l=0, h=a.length-1;
		int m=(l+h)/2;
		while(l<=h) {
			if(a[m]==srch) {
				System.out.println("element is present is our arr list.."+m+"..index position");
				break;
			}
			else if(srch.compareTo(a[m])>0) {
				l=m+1;
			}
			else {
				h=m-1;
			}
			m=(l+h)/2;
		}
		if(l>h) {
			System.out.println("not found");
		}
	
	}



	}


