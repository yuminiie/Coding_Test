class Solution {
    public long solution(long n) {
        int count = 0;
        long temp = n;
        while(temp > 0){
            temp /= 10;
            count++;
        }

        long[] answer = new long[count];
        for(int i = 0; i < count; i++){
            answer[i] = n % 10;
            n /= 10;
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (answer[i] < answer[j]) {
                    long t = answer[i];
                    answer[i] = answer[j];
                    answer[j] = t;
                }
            }
        }

        long result = 0;
        for (int i = 0; i < count; i++) {
            result = result * 10 + answer[i];
        }

        return result;
    }
}