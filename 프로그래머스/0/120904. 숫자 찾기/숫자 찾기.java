class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        boolean flag = false;
        String sen = Integer.toString(num);
        char numK = (char)(k + '0');
        for(int i = 0; i < sen.length(); i++){
            char ch = sen.charAt(i);
            if(ch == numK){
                answer = i + 1;
                flag = true;
                break;
            }
        }
        if(flag == false){
            return -1;
        }
        return answer;
    }
}