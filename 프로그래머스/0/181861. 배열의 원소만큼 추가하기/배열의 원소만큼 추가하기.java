import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int x = 0; x < answer.length; x++){
            answer[x] = list.get(x);
        }
        return answer;
    }
}