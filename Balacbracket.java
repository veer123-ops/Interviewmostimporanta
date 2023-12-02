 package javaproject1;

import java.util.Stack;

public class Balacbracket {

	public static boolean isBalanced(String expression) {
		if ((expression.length() % 2) == 1)
			return false;
		else {
			Stack<Character> stack = new Stack<>();
			for (char bracket : expression.toCharArray())
				switch (bracket) {
				case '{':
					stack.push('}');
					break;
				case '(':
					stack.push(')');
					break;
				case '[':
					stack.push(']');
					break;

				default:

					if (stack.isEmpty() || bracket != stack.peek()) {
						return false;
					}
					stack.pop();

				}
			return stack.isEmpty();
		}
	}

	public static void main(String[] args) { // TODO Auto-generated method stub
		String expression = "{}(){){]";
		boolean ansew = isBalanced(expression);
		if (ansew) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
	}

}

/*
 * // public class GFG { public static boolean areBracketsBalanced(String s) {
 * int i = -1; char[] stack = new char[s.length()]; for (char ch :
 * s.toCharArray()) { if (ch == '(' || ch == '{' || ch == '[') stack[++i] = ch;
 * else { if (i >= 0 && ((stack[i] == '(' && ch == ')') || (stack[i] == '{' &&
 * ch == '}') || (stack[i] == '[' && ch == ']'))) i--; else return false; } }
 * return i == -1; }
 * 
 * public static void main(String[] args) { String expr = "{()}[]"; // Function
 * call if (areBracketsBalanced(expr)) System.out.println("Balanced"); else
 * System.out.println("Not Balanced");
 * 
 * } }
 */
