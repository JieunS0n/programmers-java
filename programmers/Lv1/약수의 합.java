class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(n % i != 0)
                continue;
            sum += i;
        }
        return sum;
    }
}
