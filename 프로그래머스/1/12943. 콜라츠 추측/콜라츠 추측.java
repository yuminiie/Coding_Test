class Solution {
    public int solution(int num) {
        int i = 0;
        long longnum = (long)num;
        if (longnum == 1){
            return 0;
        }
        while(i < 500){
            if(longnum%2 == 0){
                longnum /= 2;
            }
            else{
                longnum = longnum * 3 + 1;
            }
                i++;
            if(longnum == 1){
                return i;
            }
        }
        return -1;
    }
}