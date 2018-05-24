package Problems;

import java.util.HashMap;
import java.util.Map;

public class ReturnIndexesForSum {

	public static void main(String[] args) 
	{
		int arr[]= {1,3,7,4};
//		for(int i:twoSum(arr,5)) 
//		{
//			System.out.println(i);
//		}
		//System.out.println(num(arr,4));
		for(int i:twoSumHash(arr,5)) 
		{
			System.out.println(i);
		}
		
	}
	public static int[] twoSumHash(int arr[],int target) 
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int i=0;
		for(i=0;i<arr.length;i++) 
		{
			int val=target-arr[i];
			if(map.containsKey(arr[i]))
			{
				return new int[] {map.get(arr[i]),i};
			}
			else 
			{
				map.put(val,i);
			}
		}
		throw new IllegalArgumentException("No two sums are equal");
		
	}
//	public static int[] twoSum(int[] nums, int target) {
//	    for (int i = 0; i < nums.length; i++) {
//	        for (int j = i + 1; j < nums.length; j++) {
//	            if (nums[j] == target - nums[i]) {
//	                return new int[] { i, j };
//	            }
//	        }
//	    }
//	    throw new IllegalArgumentException("No two sum solution");
//	}
//	public static int[] twoSumHash(int[] arr,int target) 
//	{
//		Map<Integer,Integer> map=new HashMap<>();
//		for(int i=0;i<arr.length;i++) 
//		{
//			map.put(i, arr[i]);	
//		}
//		
//		for(int j=0;j<arr.length;j++) 
//		{
//				int sub=target-arr[j];
////				System.out.println(sub);
////				System.out.println(map.get(sub));
//				if(map.containsKey(sub) && map.get(sub)!=j) 
//				{
//					return new int[] {j,num(arr,sub)};	
//				}
//		}
//		throw new IllegalArgumentException("No two sum equal");
//		
//	}
//	public static int num(int []arr1,int a)
//	{
//		int temp=0;
//		for(int i=0;i<arr1.length;i++) 
//		{
//			if(arr1[i]==a) 
//			{
//				temp=i;
//			}
//		}
//		return temp;
//		
//	}
}
