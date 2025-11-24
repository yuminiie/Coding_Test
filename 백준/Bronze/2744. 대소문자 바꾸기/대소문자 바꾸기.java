import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sen = sc.next();
        String answer = "";
        for(int i = 0; i < sen.length(); i++){
            char ch = sen.charAt(i);
            if(ch >= 97 && ch <= 122){
                answer += (char)(ch - 32);
            }
            else{
                answer += (char)(ch + 32);
            }
        }
        System.out.print(answer);
    }
}