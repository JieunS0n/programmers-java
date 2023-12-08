class Solution {
    public int solution(int[] numbers) {
        int answer = 45; // 0부터 9까지 더한 값
        for(int i = 0; i<numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}
