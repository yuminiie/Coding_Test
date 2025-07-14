class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] cntdown = new int[start_num - end_num + 1];
        for(int i = 0; i < cntdown.length; i++){
            cntdown[i] = start_num;
            start_num--;
        }
        return cntdown;
    }
}