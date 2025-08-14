class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int cnt = 0; 
        boolean tf = true;
        if (is_prefix.length() > my_string.length()) return 0;
        for(int i = 0; i < is_prefix.length(); i++){
            if(my_string.charAt(i) != is_prefix.charAt(i)){
                tf = false;
                break;
            }
        }
        if(tf == true){
            return 1;
        }
        else{
            return 0;
            }
        }
    }