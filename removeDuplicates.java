package Easy;

public class removeDuplicates {

	public static void main(String[] args) 
	{
		int []arr= {0,0,0,1,1,2,2,12,12,13};
		System.out.println(removeDuplicatesSorted(arr));
	}
	   public static int removeDuplicatesSorted(int[] nums)
	    {
	       int orig=0;
	       nums[orig]=nums[0];
	        
	        for(int i=0;i<nums.length;i++)
	        {
	       
	           if(nums[orig]!=nums[i])
	           {
	               nums[++orig]=nums[i];
	              
	           } 
	            
	        }   
	        for(int i=0;i<orig+1;i++) 
	        {
	        	System.out.println(nums[i]);
	        }
	        return orig+1;
	    }

}
