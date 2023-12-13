class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int binaryScaleCount = 0;
        int delZeroCount = 0; 
        
        String str = "";  
        
        int num = 0;
        while(true) {
            if("1".equals(s))
                break;
    
            str = "";        
            for(char c : s.toCharArray()) {
                if(c == '1')
                    str += c;
                else delZeroCount ++;
            }
           
            s = "";
            num = str.length();
            
            for(int i=0; i<str.length(); i++) {
                if(num == 1) {
                    s = "1" + s;
                    break;
                } else {   
                    s = (int)(num % 2) + s;
                    num = num/2;
                }
            }
            
            binaryScaleCount ++;
        }
        
        answer[0] = binaryScaleCount;
        answer[1] = delZeroCount;
        
        return answer;
    }
}
