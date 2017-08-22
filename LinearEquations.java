package Practice;
import java.io.*;
public class LinearEquations 
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String firsteq;
			String seceq;
			String xindex="x";
			String yindex="y";
			
			int i;
			int afteq1=0,afteq2=0;
			int coefy1=0,coefy2=0;
			int coefx1=0,coefx2=0;
			int tempoafteq2=0;
			int tempocoefy2=0;
			int tempoafteq1=0;
			int tempocoefy1=0;
			int tempocoefx1=0;
			int tempocoefx2=0;
			System.out.println("Enter the first equation:");
			firsteq=br.readLine();
			System.out.println("Enter the second equation:");
			seceq=br.readLine();
			
			for(i=0;i<firsteq.length();i++)
			{
				if((int)firsteq.charAt(0)==120||(int)firsteq.charAt(0)==88)
				{
					coefx1=1;
				}
				else if(((int)firsteq.charAt(0)==45&&(int)firsteq.charAt(1)==120)||((int)firsteq.charAt(0)==45&&(int)firsteq.charAt(1)==88))
				{
						coefx1=-1;
					
				}
				else if((int)firsteq.charAt(i)==120||(int)firsteq.charAt(i)==88)
				{
					String tempx1=firsteq.substring(0, i);
					tempx1=tempx1.trim();
					coefx1=Integer.parseInt(tempx1);
				}
				if((int)firsteq.charAt(i)==61)
				{
					if(firsteq.length()-(i+1)>1)
					{
						String tempafteq1=firsteq.substring(i+1, firsteq.length());
						tempafteq1=tempafteq1.trim();
						afteq1=Integer.parseInt(tempafteq1);
					}
					else
					{
						String z=String.valueOf(firsteq.charAt(i+1));
						afteq1=Integer.parseInt(z);
					}
					
					
				}
			}
			for(i=0;i<seceq.length();i++)
			{
				if((int)seceq.charAt(0)==120||(int)seceq.charAt(0)==88)
				{
					coefx2=1;
				}
				else if(((int)seceq.charAt(0)==45&&(int)seceq.charAt(1)==120)||((int)seceq.charAt(0)==45&&(int)seceq.charAt(1)==88))
				{
						coefx2=-1;
					
				}
				else if((int)seceq.charAt(i)==120||(int)seceq.charAt(i)==88)
				{
					String tempx2=seceq.substring(0, i);
					tempx2=tempx2.trim();
					coefx2=Integer.parseInt(tempx2);
				}
				if((int)seceq.charAt(i)==61)
				{
					if(seceq.length()-(i+1)>1)
					{
						String tempafteq2=seceq.substring(i+1, seceq.length());
						tempafteq2=tempafteq2.trim();
						afteq2=Integer.parseInt(tempafteq2);
					}
					else
					{
						String z=String.valueOf(seceq.charAt(i+1));
						afteq2=Integer.parseInt(z);
					}
					
					
				}
			}
				int x1=firsteq.indexOf(xindex);
				int y1=firsteq.indexOf(yindex);
				int x2=seceq.indexOf(xindex);
				int y2=seceq.indexOf(yindex);
				
					if((int)firsteq.charAt(x1+1)==43&&(int)firsteq.charAt(x1+2)==121)
					{
						coefy1=1;
					}	
					else if((int)firsteq.charAt(x1+1)==45&&(int)firsteq.charAt(x1+2)==121)
						{
							coefy1=-1;
						}
					else if((int)firsteq.charAt(x1+2)>47&&(int)firsteq.charAt(x1+2)<58)
					{
						coefy1=Integer.parseInt(firsteq.substring(x1+1,y1));
						
					}
					
				
				if((int)seceq.charAt(x2+2)==121)
				{
					
				
					if((int)seceq.charAt(x2+1)==43)
					{
						coefy2=1;
					}
					else if((int)seceq.charAt(x2+1)==45)
					{
						coefy2=-1;
					}
				}
				else
				{
					coefy2=Integer.parseInt(seceq.substring(x2+1,y2));	
				}
				
			if((coefx1>0&&coefx2>0)||(coefx1<0&&coefx2<0))
			{
				
				tempoafteq2=-1*coefx1*afteq2;
				tempocoefy2=-1*coefx1*coefy2;
				tempoafteq1=coefx2*afteq1;
				tempocoefy1=coefx2*coefy1;
			}
			else if(coefx1<0&&coefx2>0)
			{
				tempoafteq2=-1*coefx1*afteq2;
				tempocoefy2=-1*coefx1*coefy2;
				tempoafteq1=coefx2*afteq1;
				tempocoefy1=coefx2*coefy1;
			}
			
			
//			System.out.println(tempoafteq1);
//			System.out.println(tempoafteq2);
//			System.out.println(tempocoefy1);
//			System.out.println(tempocoefy2);
			
			
		
			double b=(tempoafteq1+tempoafteq2)/(tempocoefy1+tempocoefy2);
			double a=(afteq2-(coefy2*b))/coefx2;
			
			
			System.out.println("Value of x="+a);
			System.out.println("Value of y="+b);
			
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		
	}
}
