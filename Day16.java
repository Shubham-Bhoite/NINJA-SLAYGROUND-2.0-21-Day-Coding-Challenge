/* Valid Parentheses:

 Problem statement==>
You're given a string 'S' consisting of "{", "}", "(", ")", "[" and "]" .
Return true if the given string 'S' is balanced, else return false.

For example:
'S' = "{}()".
There is always an opening brace before a closing brace i.e. '{' before '}', '(' before ').
So the 'S' is Balanced.
 */


 import java.util.Stack;

 public class Day16 {
     public static boolean isValidParenthesis(String s) {
         Stack<Character> stack = new Stack<>();
 
         for (char ch : s.toCharArray()) {
             if (ch == '(' || ch == '{' || ch == '[') {
                 stack.push(ch);
             } else if (ch == ')' || ch == '}' || ch == ']') {
                 if (stack.isEmpty()) return false;
 
                 char top = stack.pop();
                 if ((ch == ')' && top != '(') ||
                     (ch == '}' && top != '{') ||
                     (ch == ']' && top != '[')) {
                     return false;
                 }
             }
         }
         return stack.isEmpty();
     }
 }
 
