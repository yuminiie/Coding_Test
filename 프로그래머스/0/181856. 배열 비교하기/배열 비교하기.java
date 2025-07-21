class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum_1 = 0;
        int sum_2 = 0;
    
        if(arr1.length > arr2.length){
            return 1;
        }
        else if(arr1.length < arr2.length){
            return -1;
        }
        else{
            for(int i = 0; i < arr1.length; i++){
                sum_1 += arr1[i];
            }
            for(int i = 0; i < arr2.length; i++){
                sum_2 += arr2[i];
            }
            if(sum_1 > sum_2)
                return 1;
            else if(sum_1 < sum_2)
                return -1;
            else return 0;
        }
    }
}   