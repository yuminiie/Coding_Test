class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            char[] chars = my_strings[i].toCharArray();  
            int start = parts[i][0];
            int end = parts[i][1];

            for (int j = start; j <= end; j++) {
                answer += chars[j];
            }
        }

        return answer;
    }
}