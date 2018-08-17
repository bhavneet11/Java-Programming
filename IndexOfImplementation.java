package Easy;

public class IndexOfImplementation {

	public static void main(String[] args) {
		System.out.println(strStr("BhavneetSingh","havneetsi"));

	}
	 public static int strStr(String haystack, String needle) 
	    {
	       
	        if(needle==null||haystack==null)
	        {
	            return 0;
	        }
	        if(needle.length()==0)
	            return 0;
	       for(int i=0;i<haystack.length();i++)
	       {
	               if(haystack.length()<needle.length()+1)
	               {
	                   return -1;
	               }
	               
	                   int c=i;
	                    for(int j=0;j<needle.length();j++){
	                        if(needle.charAt(j)==haystack.charAt(c))
	                        {
	                            if(j==needle.length()-1)
	                                return i;
	                            c++;
	                        }
	                        else{
	                            break;
	                        }
	                 
	                     }
	    
	    }
	    return -1;
	}
}
