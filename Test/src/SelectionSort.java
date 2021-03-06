
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {2,4,7,9,1,6,5,0,3,8};
		int n = arr.length;
		
		System.out.println("Array after sorting...");
		for(int a:arr){
			System.out.print(a +" ");
		}
		
		SelectionSort bs = new SelectionSort();
		bs.sort(arr, n);
		
		System.out.println("\n Array after sorting...");
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
	
   public void sort(int[] a, int n){
	   for(int i=0; i< n-1; i++){
		   int min = i;
		   for(int j=i+1; j< n; j++){
			   if(a[j] < a[min]){  min = j; }
			   int temp = a[min];
				  a[min] = a[j];
				  a[j] = temp;
		   }
	   }
   }
}