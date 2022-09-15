package ds;


	public class Bubble {
		public static void print(int a[])
		{
			int n=a.length;
			int i;
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	public static void bubbleSort(int a[])
	{
		int n = a.length;
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]= {35,12,8,78,56};
			Bubble b1=new Bubble();
			System.out.println("Before sorting array elements are-");
			b1.print(a);
			b1.bubbleSort(a);
			System.out.println();
			System.out.println("After sorting array elements are-");
			b1.print(a);
			
		}

	}

