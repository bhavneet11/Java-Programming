package Easy;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseEfficient(1534236469));
	}
	 public static int reverse(int x) 
	    {
		 int a=x/10;
		 	if(a>Integer.MAX_VALUE/10) 
		 	{
		 		return 0;
		 	}
	        char[] ch=String.valueOf(x).toCharArray();
	        char temp=' ';
	        for(int i=0,j=ch.length-1;i<j;i++,j--)
	        {
	             if(ch[i]=='-')
	                {
	                    i++;
	                }
	             temp=ch[i];
	             ch[i]=ch[j];
	            ch[j]=temp;
	        }    
	        return Integer.parseInt(String.valueOf(ch));
	     }
	   public static int reverseEfficient(int x){
		      
	        if(x>Math.pow(2, 31)-1||x<(-1*Math.pow(2, 31)))
	        {
	            return 0;
	        }
	        else
	        {
	             int temp=0;
	             int num=0;
	            while(x!=0)
	            {
	                num=num*10+x%10;  
	                x=x/10;
	            }
	        
			    return num;    
	        }
	        
	        
	}
}
