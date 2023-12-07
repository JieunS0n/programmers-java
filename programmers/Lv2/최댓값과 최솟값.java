class Solution {
    public String solution(String s) {
        String[] strList = s.split(" ");
        int length = strList.length;
        int[] numList = new int[length];
        
        for(int i = 0; i < length; i++) {
            numList[i] = Integer.parseInt(strList[i]);
        }
            
        int min, max;
        min = max = numList[0];
        
        for(int num : numList) {
            if(min > num) {
                min = num;
            } else if(max < num) {
                max = num;
            }  
        }
        return min + " " + max;
    }
}
