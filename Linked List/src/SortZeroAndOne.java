
public class SortZeroAndOne {

	public static int[] arr = {0,0,1,0,0,1,1,0};
	
	public static void main(String[] args) {
		

		System.out.print("Array Before Sorting : ");
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + ", ");
		
		System.out.println();
		sort(arr,arr.length);

	}
	
	public static void sort(int[] arr, int n) {
		int zero = 0;
		
		for(int i=0;i<n;i++)	{
			if(arr[i] == 0)
				++zero;
		}
		
		for(int i=0;i<n;i++)	{
			if(zero != 0)	{
				arr[i] = 0;
				--zero;
			} else
			{
				arr[i] = 1;
			}
			
		}
		
		System.out.print("Array After Sorting  : ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + ", ");
	}
}
