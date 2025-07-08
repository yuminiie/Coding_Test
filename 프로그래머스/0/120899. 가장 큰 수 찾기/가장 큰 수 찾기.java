class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int Max = 0;
        int idx = 0;
        for(int i = 0; i < array.length; i++){
            if(Max < array[i]){
                Max = array[i];
            }
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] == Max)
                break;
            idx++;
        }
        answer[0] = Max;
        answer[1] = idx;
        return answer;
    }
}