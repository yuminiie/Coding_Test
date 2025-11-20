import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int answer = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] == v){
                answer++;
            }
        }
        System.out.print(answer);
    }
}