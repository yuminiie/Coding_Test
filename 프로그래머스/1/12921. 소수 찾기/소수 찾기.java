class Solution {
    public int solution(int n) {
        boolean[] PrimeX = new boolean[n + 1];

        PrimeX[0] = true;
        PrimeX[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!PrimeX[i]) {
                for (int j = i * i; j <= n; j += i) {
                    PrimeX[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (!PrimeX[i]) count++;
        }

        return count;
    }
}