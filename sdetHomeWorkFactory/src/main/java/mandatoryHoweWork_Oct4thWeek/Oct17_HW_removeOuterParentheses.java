package mandatoryHoweWork_Oct4thWeek;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class Oct17_HW_removeOuterParentheses {

	//https://leetcode.com/problems/remove-outermost-parentheses/

	public String removeOuterParentheses1(String s) {
		Stack<Character> st = new Stack<>();
		String res = "";
		for(Character c: s.toCharArray()){
			if(c == '('){
				if(!st.isEmpty()){
					res += c;
				}
				st.push(c);
			}else{
				st.pop();
				if(!st.isEmpty()){
					res += c;
				}
			}
		}
		return res;
	}
	public String removeOuterParentheses(String s) {

		Stack<Character> stack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i]=='(') {
				if (stack.size()>=1) {
					sb.append(ch[i]);
				} 
					stack.push(ch[i]);
				
			}
			else {
				if (stack.size()>1) {
					sb.append(ch[i]);
				}
					stack.pop();
			
			}
		}


		return sb.toString();
	}

	@Test
	public void Positive()
	{
		String actual=removeOuterParentheses("(()())(())");
		String expected ="()()()";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void Positive1()
	{
		String actual=removeOuterParentheses("(()())(())(()(()))");
		String expected ="()()()()(())";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void Positive2()
	{
		String actual=removeOuterParentheses("()()");
		String expected ="";
		Assert.assertEquals(expected, actual);
	}
}
