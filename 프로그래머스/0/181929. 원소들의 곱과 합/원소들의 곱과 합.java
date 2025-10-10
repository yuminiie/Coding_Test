class Solution {
    public int solution(int[] num_list) {
        int time = 1;
        int sum = 0;
        for(int i = 0; i < num_list.length; i++){
            time *= num_list[i];
            sum += num_list[i];
        }
        if(time > sum*sum){
            return 0;
        }
        else{
            return 1;
        }
    }
}