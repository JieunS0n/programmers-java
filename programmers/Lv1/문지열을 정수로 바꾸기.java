class Solution {
    public int solution(String s) {
        String answer = "";
        int multiply = 1;
        String[] strList = s.split("");
        for(String str : strList) {
            switch(str) {
                case "-" :
                    multiply = -1;
                    break;
                case "+" :
                    break;
                default :
                    answer += str;
                    
            }
        }
        return Integer.parseInt(answer) * multiply;
    }
}
