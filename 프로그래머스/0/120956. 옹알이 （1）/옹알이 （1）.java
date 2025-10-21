class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        String[] ongali = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            
            for (int j = 0; j < ongali.length; j++) {
                word = word.replace(ongali[j], " ");
            }
            
            if (word.trim().isEmpty()) {
                count++;
            }
        }
        
        return count;
    }
}
