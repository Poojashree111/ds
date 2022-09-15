package ds;

public class Linear2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = { "pooja","Lp","vashu","chandini"};
		String item="pooja";
		String temp="Null";
		for(int i=0; i<array.length;i++) {
			if(array[i]==item) {
				System.out.println(" the index is.."+i);
				temp=temp+1;
			}
		}
		if(temp=="Null") {
			System.out.println("item is not found in the list");
		}

	}

}
