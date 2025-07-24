import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] num = new int[T][2];
        for(int i = 0; i < T; i++){
            num[i][0] = sc.nextInt();
            num[i][1] = sc.nextInt();
        }
        for(int i = 0; i < T; i++){
                int sum = num[i][0] + num[i][1];
                System.out.println("Case #" + (i+1) + ": "+ sum);
        }
    }
}