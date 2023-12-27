class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        for(int i=0; i<arr.length-1; i++) {
            int value1 = arr[i];
            int value2 = arr[i+1];
            
            // 최대 공약수 구하기 (유클리드 호제법 사용)
            while(value2 != 0) {
                answer = value1 % value2;
                value1 = value2;
                value2 = answer;
            }
            
            // 최소 공배수로 answer값 초기화
            answer = arr[i] * arr[i+1] / value1;
            arr[i+1] = answer;
        }
        return answer;
    }
}
