import java.util.Stack;
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
for(int ind=0;ind<s.length();ind++)
{
    char ch=s.charAt(ind);
    if(ch=='(' || ch=='[' || ch=='{')
    stack.push(ch);
    else
    {
        if(stack.isEmpty())
          return false;
        char topData=stack.pop();
        if(ch==')' && topData!='(' || ch==']' && topData!='[' || ch=='}' && topData!='{')
         return false;
    }
}
return stack.isEmpty();
    }}      