class Solution {
    public String solution(String phone_number) {
        String star = "*";
        int length = phone_number.length();
        return star.repeat(length-4) 
            + phone_number.substring(length-4, length);
    }
}
