class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char a = alp.charAt(0);
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(a == ch){
                answer += (char)(ch - 32);
            }
            else {
                answer += ch;
            }
        }
        return answer;
    }
}