class Solution {
    public int solution(int num) {
        long input = num; // case3 때문에 추가함
        int answer = 0;
        while(true) {
            if(input == 1)
                break;
            
            if(input % 2 == 0)
                input /= 2;
            else 
                input = input * 3 + 1;
            
            answer ++;
            
            if(answer >= 500)
                return -1;
        }
        return answer;
    }
}
