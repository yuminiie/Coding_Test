import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = N; i >= 1; i--){
            for(int j = i; j <= N-1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
