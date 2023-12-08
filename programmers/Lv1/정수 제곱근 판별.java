class Solution {
    public long solution(long n) {
        long answer = -1;
        long num = 1;
        while(true) {
            if(num * num == n) {
                answer = (num + 1) * (num + 1);
                break;
            } else if(num * num > n)
                break;
            num ++;
        }
        return answer;
    }
}
