package Problems;

public class shiftingZeroToEnd {

	public static void main(String[] args) 
	{
		int arr[]= {1,0,2,3,0,4,0};
		shiftZeroes(arr);
		

	}
	public static void shiftZeroes(int arr[]) 
	{
		int i=0,
		for(i=0;i<arr.length;i++)
		{
		if(arr[i]!=0) {
			int temp=0;
			temp= arr[j+1];
			arr[j+1] = arr[i];
			arr[i] = temp;
			j++;
			
			
		}
			
		}
		for(int k=0;k<arr.length;k++) 
		{
			System.out.println(arr[k]);
		}
	
	}
}
