class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int inputOneCount = 0;
        int oneCount = 0;
        
        answer = n;
        
        for(int i = 0; i < n/2; i++) {
            if(answer == 1) {
                break;
            } else if(answer % 2 != 0) {
                inputOneCount ++;
            }
            answer /= 2;
        }
        
        while(true) {
            answer = ++n;
            oneCount = 0;
            for(int i = 0; i < n/2; i++) {
                if(answer == 1) {
                    break;
                } else if(answer % 2 != 0) {
                    oneCount ++;
                }
                answer /= 2;
            }
            if(inputOneCount == oneCount)
                break;
        }
        answer = n;
        return answer;
    }
}
