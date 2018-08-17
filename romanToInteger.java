package Easy;

import java.util.HashMap;

public class romanToInteger {

	public static void main(String[] args) {
		System.out.println(processSum("MDCXCV"));
		
	}

	static int processSum(String s) {
		s = s.toUpperCase();
		int sum = 0;
		char c1 = ' ';
		char c2 = ' ';

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		
		if(s.length()==1) 
		{
			return hm.get(s.charAt(0));
		}
		for (int i = 0; i < s.length(); i++) {
			
			c1 = s.charAt(i);
			if (i + 1 < s.length()) {
				
				c2 = s.charAt(i + 1);
				if (hm.get(c1) >= hm.get(c2)) {
					sum += hm.get(c1);
					System.out.println("c1 "+i);

				} else {
					sum += hm.get(c2) - hm.get(c1);
					i++;
					System.out.println("c2 "+i);
				}

			}
			else
			{
				sum+=hm.get(c1);
			}

		}

		return sum;

	}
}
