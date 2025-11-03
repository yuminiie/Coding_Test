class Solution {
    public int solution(int chicken) {
        int s = 0; 
        int cou = chicken; 

        while (cou >= 10) {
            int ns = cou / 10; 
            s += ns;         
            cou = ns + (cou % 10); 
        }

        return s;
    }
}