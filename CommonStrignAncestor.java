package Problems;

public class CommonStrignAncestor {

	public static void main(String[] args) 
	{
		String arr[]= {"abc","abd","abf","i"};
		System.out.println(Common(arr));

	}
	public static String Common(String arr[]) 
	{
		String ances=arr[0];
		String temp="";
		for(int i=1;i<arr.length;i++) 
		{
			temp=com(ances,arr[i]);
			if(temp.length()>0) 
			{
				if(temp.length()<ances.length())
				{
					ances=temp;
				}
			}	
			else 
			{
				return "No Common Ancestor";
			}
				
			
		}
		return ances;
	}
	
	public static String com(String a, String b)
	{
		String len = "";
		if(a.length()<=b.length()) 
		{
			for(int i=0;i<a.length();i++) 
			{
				if(a.charAt(i)==b.charAt(i)) 
				{
					len=len+a.charAt(i);
				}
				else 
				{
					break;
				}
			}
		}
		else 
		{
			for(int i=0;i<b.length();i++) 
			{
				if(a.charAt(i)==b.charAt(i)) 
				{
					len=len+b.charAt(i);
				}
				else 
				{
					break;
				}
			}
		}
		return len;
	}
	
}