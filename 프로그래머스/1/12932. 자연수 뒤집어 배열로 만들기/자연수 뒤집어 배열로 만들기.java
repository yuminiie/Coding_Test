class Solution {
    public long[] solution(long n) {
        int count = 0;
        
        for(long i = n ;i > 0;i /= 10)
                count++;
        
        long[] answer = new long[count];
        
        int i = 0;
        while (n > 0){
                answer[i] = n % 10;
                n/=10;
            i++;
        }
        return answer;
    }
}