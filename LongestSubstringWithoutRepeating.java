package Problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) 
	{
		System.out.println(longestSubString("abcdeabcdabc"));

	}
	public static String longestSubString(String st) 
	{
		String finalSt="";
		boolean arr[]=new boolean[256];
		String temp="";
		for(int i=0;i<st.length();i++)
		{
			int val=(int)st.charAt(i);
			if(arr[val]) 
			{
				if(finalSt.length()>temp.length())
				{
					temp=finalSt;
				}
				
				finalSt="";
				reset(arr);
				i--;
				
			}
			else 
			{
				finalSt=finalSt+st.charAt(i);
				arr[val]=true;
			}
			
		}
		return temp;
	}
	public static boolean[] reset(boolean arr[]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=false;
		}
		return arr;
	}

/*Now with HashSet*/
	 public static int longestSubStringHashMap(String st) 
	{
		Set<Character> set=new HashSet<>();
		int ans=0,i = 0,j=0;
		int n=st.length();
		while(i<n && j<n)
		{
			if(!set.contains(st.charAt(j)))
			{
				set.add(st.charAt(j++));
				ans=Math.max(ans,j-i);
			}
			else 
			{
				set.remove(st.charAt(i));
			}
		}
		return ans; 
	}
} 

