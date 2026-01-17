import java.util.StringTokenizer;

class Solution {
    public int solution(String number) {
         int answer = 0;
        StringTokenizer st = new StringTokenizer(number);
        int cnt = 0;
        for(int i = 0; i < number.length(); i++){
            answer += number.charAt(i) - '0';
        }
        
        return answer % 9;
    }
}