import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                cnt++;
            }
        }
        if (cnt == 0) {
            return new int[] { -1 };
        }
        int[] Narr = new int[cnt];
        int Ncnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                Narr[Ncnt] = arr[i];
                    Ncnt++;
            }
        }
        Arrays.sort(Narr);
        return Narr;
    }
}