class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int Ncnt = 1;
        int Nn = n;
    while(n != 1){
         cnt++;
        if(n % 2 == 0){
            n /= 2;
        }
        else{
            n = 3 * n + 1;
        }
    }
        int[] answer = new int[cnt+1];
        answer[0] = Nn;
        while(Nn != 1){
        if(Nn % 2 == 0){
            answer[Ncnt] = Nn / 2;
            Nn /= 2;
        }
        else{
            answer[Ncnt] = 3 * Nn + 1;
            Nn = 3 * Nn + 1;
        }
        Ncnt++;
    }
        return answer;
    }
}