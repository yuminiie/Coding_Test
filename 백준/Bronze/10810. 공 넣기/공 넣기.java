import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();
        
        for(int t = 0; t < M; t++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int tt = i-1; tt < j; tt++){
                arr[tt] = k;
            }
        }
        for(int T = 0; T < N; T++){
            System.out.print(arr[T] + " ");
        }
    }
}