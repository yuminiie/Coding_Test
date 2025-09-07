import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String result="";
        for(int i = 0; i < T; i++) {
            String str = sc.next();
            result += str.charAt(0);
            result += str.charAt(str.length()-1)+"\n";
        }
        System.out.print(result);
    }
}
