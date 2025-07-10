class Solution {
    public int solution(int[] sides) {
        int Max = 0;
        int sum = 0;
        for(int i = 0; i < 3; i++){
            if(Max < sides[i]) Max = sides[i];
            sum += sides[i];
        }
        if(sum - Max > Max) return 1;
        else return 2;
    }
}