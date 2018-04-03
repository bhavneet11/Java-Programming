package Strings;

public class maxCharInString {

	public static void main(String[] args) 
	{
	System.out.println(maxString("bhavneet"));
	}
	static char maxString(String str) 
	{
		int temp = 0,max;
		char a=' ';
		int arr[]=new int[128]; 
		for(int i=0;i<str.length();i++) 
		{
			max=arr[(int)str.charAt(i)]++;
			if(max>temp) 
			{
				a=str.charAt(i);
				temp=max;
			}
		}
		return a;
	}

}
