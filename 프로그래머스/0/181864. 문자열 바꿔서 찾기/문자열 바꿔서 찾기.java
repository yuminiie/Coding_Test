class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String newmyString = "";
        for(int i = 0; i < myString.length(); i++){
            char ch = myString.charAt(i);
            if(ch == 'A'){
                newmyString += 'B';
            } else {
                newmyString += 'A';
            }
        }
        if(newmyString.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}