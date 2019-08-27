package Practice;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		int n = 5;
		int temp = 0;
		
		while(n>0) {
			temp = a[a.length-1];
			for(int i=a.length-1;i>0;i--) {
				a[i]=a[i-1];			
			}
			a[0]=temp;
			n--;
		}
		
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j] + " ");
		}
	}

}
