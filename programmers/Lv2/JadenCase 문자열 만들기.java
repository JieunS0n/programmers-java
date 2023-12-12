class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] wordArray = s.split(" ", -1);
        
        for(int i = 0; i < wordArray.length; i++) {
            String word = wordArray[i];
            if(word.length() > 0)
                word = word.substring(0,1).toUpperCase() 
                 + word.substring(1,word.length());
            if(i > 0)
                answer += " ";
            answer += word;
        }
        return answer;
    }
}
