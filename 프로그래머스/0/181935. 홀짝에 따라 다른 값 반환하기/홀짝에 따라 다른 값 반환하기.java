class Solution {
    public int solution(int n) {
        int answer = 0;
        switch(n%2){
            case 1 : 
                for(int i = 1; i <= n; i += 2){
                answer += i;
                } break;
            default :
                for(int i = 2; i <= n; i += 2){
                answer += i*i;
                }
        }
        return answer;
    }
}