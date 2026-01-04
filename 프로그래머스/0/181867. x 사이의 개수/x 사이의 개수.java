import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                list.add(count);
                count=0;
            }else{
                count++;
            }
        }
        list.add(count);
        int[] answer = new int[list.size()];
        for(int x = 0; x < answer.length; x++){
            answer[x] = list.get(x);
        }
        return answer;
    }
}