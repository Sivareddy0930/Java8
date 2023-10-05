package Demo;

public class Demo5 {

	public static int[] shortArray(int arr1[],int arr2[]) {
		
		int n1=arr1.length;
		int n2=arr2.length;
		
		int arr[]=new int[n1+n2];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				arr[k++]=arr1[i++];
			}
			else {
				arr[k++]=arr2[j++];
			}
		}
		
		
		while(i<n1) {
			arr[k++]=arr1[i++];
		}
		while(j<n2) {
			arr[k++]=arr2[j++];
		}
		
		return arr;
		
		
		
		
		
	}
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
		int arr2[]= {2,6,8};
		int m[]=shortArray(arr1,arr2);
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]);
		}
	}

}
