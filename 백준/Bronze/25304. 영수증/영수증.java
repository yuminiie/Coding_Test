import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        int N = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= N; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            sum += a * b;
        }
        if(sum == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}