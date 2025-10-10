class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 0; i < numLog.length-1; i++){
            if(numLog[i+1]-1 == numLog[i]){
                answer += "w";
            }
            else if(numLog[i+1]+1 == numLog[i]){
                answer += "s";
            }
            else if(numLog[i+1]-10 == numLog[i]){
                answer += "d";
            }
            else {
                answer += "a";
            }
        }
        return answer;
    }
}