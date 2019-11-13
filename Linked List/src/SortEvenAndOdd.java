
public class SortEvenAndOdd {

//	public static int[] arr = {1,9,5,3,2,6,7,11};
	
//	public static int[] arr = {1,3,2,4,7,6,9,10};
	
	public static int[] arr = {12,34,45,9,8,90,3};
	
	public static void main(String[] args) {
		

		System.out.print("Array Before Sorting   : ");
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + ", ");
		
		System.out.println();
		sort1(arr,arr.length);
		
		System.out.println();
		sort2(arr,arr.length);

	}
	
	public static void sort1(int[] arr, int n) {
		
		int i = -1;
		int j = 0;
		
		while(j != n)	{
			
			if(arr[j] % 2 == 0)	{
					++i;
				
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			
			++j;
		}
		
		System.out.print("Array After Sorting-2  : ");
		for(int k=0;k<n;k++)
			System.out.print(arr[k] + ", ");
	}
	
	public static void sort2(int[] arr, int n)	{
		int left = 0;
		int right = n-1;
		
		while(left<right)	{
			
			while(arr[left] % 2 == 0 && left<right)
				++left;
			
			while(arr[right] % 2 == 1 && left<right)
				--right;
			
			if(left<right)	{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				++left;
				--right;
			}	
		}
		
		System.out.print("Array After Sorting-1  : ");
		for(int k=0;k<n;k++)
			System.out.print(arr[k] + ", ");
		
	}
}
