class Solution {
    public int solution(int order) {
        int answer = 0;
        String sen = Integer.toString(order);
        for(int i = 0; i < sen.length(); i++){
            char ch = sen.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9'){
                answer++;
            }
        }
        return answer;
    }
}