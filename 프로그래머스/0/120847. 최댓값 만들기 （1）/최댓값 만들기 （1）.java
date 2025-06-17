class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int cont = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                cont = numbers[i] * numbers[j];
                if(cont > answer)
                    answer = cont;
            }
        }
        return answer;
    }
}