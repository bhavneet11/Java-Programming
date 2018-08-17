package Easy;

import java.util.Stack;

public class ValidExpression {

	public static void main(String[] args) {
		System.out.println(isValid("}{"));

	}

	public static boolean isValid(String s) {
		if (s.length() == 0)
			return true;

		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			} else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
				if (st.isEmpty()) {
					return false;
				}
				else if(!check(st.pop(),s.charAt(i)) ){
		        	return false;
				}
			}

		}
		if(st.isEmpty()) 
		{
			return true;
		}
		else 
		{
			return false;
		}

	}

	

	public static boolean check(int a, int b) {
		if (a == '(' && b == ')')
			return true;
		else if (a == '{' && b == '}')
			return true;
		else if (a == '[' && b == ']')
			return true;
		return false;
	}
}
