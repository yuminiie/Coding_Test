class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int newN = my_string.length() - n;
        for(int i = newN; i < n + newN; i++){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}