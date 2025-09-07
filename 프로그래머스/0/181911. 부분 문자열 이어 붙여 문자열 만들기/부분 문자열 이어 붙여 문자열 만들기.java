class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            String str = my_strings[i];

            for (int j = start; j <= end; j++) {
                answer += str.charAt(j); 
            }
        }

        return answer;
    }
}