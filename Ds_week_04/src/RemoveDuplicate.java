
public class RemoveDuplicate {
	static void removeDup(int arr[],int n) {
		int count=1;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[count++]=arr[i+1];
			}
		}
		for(int j=count;j<n;j++) {
			arr[j]=0;
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,10,20,20,30,30,40,50,50};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}System.out.println();
		removeDup(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}

	}

}
