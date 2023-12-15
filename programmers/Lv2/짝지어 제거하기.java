import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<String> stack = new Stack<>();
        String[] strList = s.split("");
        
        String str = null;
        for(int i=0; i<strList.length; i++) {      
            str = strList[i];
            if(!stack.isEmpty() 
               && stack.peek().equals(str)) {
                stack.pop();   
            } else stack.push(str);    
        }
    
        return stack.isEmpty() ? 1 : 0;
    }
}
