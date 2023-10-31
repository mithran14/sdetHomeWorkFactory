package mandatoryHoweWork_Oct4thWeek;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.apache.groovy.parser.antlr4.GroovyParser.IfElseStatementContext;
import org.junit.Test;
import org.testng.Assert;

public class Oct21_CW_ {


	public String decodeString(String s) {

		Stack<Character> stack=new Stack<>();
		char[] ch = s.toCharArray();

		for (int i = 0; i <ch.length; i++) {
			if (ch[i]!=']') {
				stack.push(ch[i]);
			}
			else{
				StringBuilder sb=new StringBuilder();
				while(stack.peek()!='[') {
					sb.append(stack.pop());
					stack.pop();
						int k=0;
						while(Character.getNumericValue(stack.pop())>0) {
							k=k*10+stack.pop();
						}
						StringBuilder op=new StringBuilder();
						for (int j =0; j<=k; j++) {
							op.append(sb);
						}
						for (int j = 0; j < op.length(); j++) {

						}
					}
					sb.append(stack.pop());
				}

			}

		}

		return s;

	}
	@Test
	public void Positive()
	{
		String actual=decodeString("3[a2[c]]");
		String expected ="accaccacc";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void Positive1()
	{
		String actual=decodeString("3[a]2[bc]");
		String expected ="aaabcbc";
		Assert.assertEquals(expected, actual);
	}
}
