class Solution {
    public int[] solution(long n) {
        String[] str_list = String.valueOf(n).split("");
        int length = str_list.length;
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++) {
            answer[i] = Integer.parseInt(str_list[length-i-1]);
        }
        return answer;
    }
}
