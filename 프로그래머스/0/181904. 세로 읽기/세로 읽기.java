class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int cnt = 0;
        int row = my_string.length() / m;
        char[][] arr = new char[row][m];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < m; j++){
                char ch = my_string.charAt(cnt);
                cnt++;
                arr[i][j] = ch;
            }
        }
        for(int x = 0; x < row; x++){
            answer+=arr[x][c-1];
        }
        return answer;
    }
}