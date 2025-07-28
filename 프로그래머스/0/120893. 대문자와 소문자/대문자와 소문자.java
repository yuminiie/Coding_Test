class Solution {
    public String solution(String my_string) {
        String result = "";
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z'){
                result += (char) (ch + 32);
            }
            else if(ch >= 'a' && ch <= 'z'){
                result += (char) (ch - 32);
            }
        }
        return result;
    }
}