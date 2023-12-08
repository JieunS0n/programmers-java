class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int signNum = 1;
        for(int i = 0; i < absolutes.length; i++) {
            signNum = signs[i] ? 1 : -1;
            answer += absolutes[i] * signNum;
        }
        return answer;
    }
}
