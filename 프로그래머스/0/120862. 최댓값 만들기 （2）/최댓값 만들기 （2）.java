import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int max_1 = numbers[numbers.length-1] * numbers[numbers.length-2];
        int max_2 = numbers[0] * numbers[1];
        if(max_1 > max_2){
            answer = max_1;
        } else {
            answer = max_2;
        }
        return answer;
    }
}