class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int cnt = 0;
        for(int i = n; i < num_list.length; i++){
            answer[cnt] = num_list[i];
            cnt++;
        }
        int cnt2 = cnt;
        for(int x = 0; x < n; x++){
            answer[cnt2] = num_list[x];
            cnt2++;
        }
        return answer;
    }
}