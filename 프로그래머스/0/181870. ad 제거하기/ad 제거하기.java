import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                list.add(strArr[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int x = 0; x < list.size(); x++){
            answer[x] = list.get(x);
        }
        return answer;
    }
}