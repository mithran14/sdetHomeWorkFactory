package mandatoryHoweWork_Oct3rdWeek;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class Oct17_HW_RemoveOuterParantheses2 {
	
	//ip: string, op: String
	//logic: init char stack & sb
	//1. Iterate all elements of s
	//2. if char is ( -> stack size is gte 1, append char to sb
			//push char to stack
	//if char is ) -> stack size is gt 1, append char to sb
			//pop stack
	//return sb as string
	
	//TC & SC: O[N]
	public String removeOuterParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                 if(stk.size()>=1)
                 {
                     sb.append(ch);
                 }
                stk.push(ch);
            }
            else{
                if(stk.size()>1)
                 {
                     sb.append(ch);
                 }
                stk.pop();
            }
        }
        return sb.toString();
    }
	
	 @Test
		public void test() {
			Assert.assertEquals("()()()", removeOuterParentheses("(()())(())"));
		}
		@Test
		public void test1() {
			Assert.assertEquals("()()()()(())", removeOuterParentheses("(()())(())(()(()))"));
		}
		@Test
		public void test2() {
			Assert.assertEquals("", removeOuterParentheses("()()"));
		}

}