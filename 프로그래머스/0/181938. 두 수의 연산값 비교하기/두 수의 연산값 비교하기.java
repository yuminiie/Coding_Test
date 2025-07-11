class Solution {
    public int solution(int a, int b) {
        int time = 2 * a * b;
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        if(answer >= time){
            return answer;
        }   
        else{
            return time;
        }
    }
}