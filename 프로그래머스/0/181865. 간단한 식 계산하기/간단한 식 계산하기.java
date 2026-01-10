import java.util.StringTokenizer;

class Solution {
    public int solution(String binomial) {
        StringTokenizer st = new StringTokenizer(binomial);
        String[] arr = new String[3];
        int cnt = 0;
        
        while(st.hasMoreTokens()){
            arr[cnt] = st.nextToken();
            cnt++;
        }
        
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[2]);
        String op = arr[1];
        int answer = 0;
        switch(op){
            case "+" : answer = num1 + num2; break;
            case "-" : answer = num1 - num2; break;
            case "*" : answer = num1 * num2; break;
        }
        return answer;
    }
}