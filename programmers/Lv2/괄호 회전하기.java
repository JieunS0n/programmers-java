import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int iterNum = 0;
        Stack<String> stack = new Stack<>();
        int strLength = s.length();
        
        while(strLength > iterNum) {
            stack = new Stack<>();
            String changeStr = String.format("%s%s", s.substring(iterNum, strLength)
                                , s.substring(0, iterNum));
            String[] strArray = changeStr.split("");
            for(String str : strArray)
            {
                if(!stack.empty() &&
                        ((str.equals(")") && stack.peek().equals("("))
                        || (str.equals("]") && stack.peek().equals("["))
                        || (str.equals("}") && stack.peek().equals("{"))))
                {
                    stack.pop();
                } else 
                    stack.push(str);
            }

            if(stack.empty()) {
                answer ++;
            }         
            iterNum ++;
        }
        return answer;
    }
}
