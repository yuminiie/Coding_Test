class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i <= myString.length() - pat.length(); i++){
            String temp = "";
            for(int j = i; j < i + pat.length(); j++){
                temp += myString.charAt(j);
            }
            if(temp.contains(pat)){
                answer++;
            }
        }
        return answer;
    }
}