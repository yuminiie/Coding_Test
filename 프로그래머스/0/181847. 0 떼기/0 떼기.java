class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean tf = false;
        for(int i = 0; i < n_str.length(); i++){
            char ch = n_str.charAt(i);
            if(tf == false && ch == '0'){
                continue;
            }
            tf = true;
            if(tf == true){
                answer += ch;
            }
        }
        return answer;
    }
}