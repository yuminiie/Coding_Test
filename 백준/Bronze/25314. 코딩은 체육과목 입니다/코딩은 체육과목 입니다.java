import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int numLongs = N / 4;

        String result = "";

        for (int i = 0; i < numLongs; i++) {
            result += "long "; 
        }
        
        result += "int";
        
        System.out.println(result);

        sc.close();
    }
}