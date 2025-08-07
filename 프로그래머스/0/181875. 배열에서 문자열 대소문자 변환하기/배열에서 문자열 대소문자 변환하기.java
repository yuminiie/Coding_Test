class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            String str = "";
            
            if(i%2==0){
            
                for(int j = 0; j < strArr[i].length(); j++){
                    char ch = strArr[i].charAt(j);
                
                    if (ch >= 'A' && ch <= 'Z') {
                        str += (char)(ch + 32);
                    } 
                    else
                        str += ch;
                }
            }
            else{
                for(int j = 0; j < strArr[i].length(); j++){
                    char ch = strArr[i].charAt(j);
                    
                    if (ch >= 'a' && ch <= 'z') {
                        str += (char)(ch - 32);
                    } 
                    else
                        str += ch;
                    }
            }
            answer[i] = str;
        }
        return answer;
    }
}