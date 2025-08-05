import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            }
            else{
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        
        System.out.println(result);
    
    }
}