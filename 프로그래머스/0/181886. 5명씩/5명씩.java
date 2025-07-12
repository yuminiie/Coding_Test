class Solution {
    public String[] solution(String[] names) {
        int cnt = 0;
        for(int i = 0; i < names.length; i++){
            if(i%5==0)
                cnt++;
        }
        String[] first = new String[cnt];
        int idx = 0;
        for(int i = 0; i < names.length; i++){
            if(i%5==0){
                first[idx] = names[i];
                    idx++;
            }
        }
        return first;
    }
}