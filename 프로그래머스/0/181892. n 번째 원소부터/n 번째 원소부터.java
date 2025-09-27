class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = 0;
        for(int i = n-1; i < num_list.length; i++){
            count++;
        }
        int[] answer = new int[count];
        int cnt = 0;
        for(int i = n-1; i < num_list.length; i++){
            answer[cnt] = num_list[i];
                cnt++;
        }
        return answer;
    }
}