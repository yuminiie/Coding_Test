import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int Zzang = sc.nextInt();
        int a = sc.nextInt();
        int sum = 0;
        
        sum = a%100%10;
        System.out.println(Zzang*sum);
        sum = a%100/10;
        System.out.println(Zzang*sum);
        sum = a/100;
        System.out.println(Zzang*sum);
        System.out.println(Zzang*a);
    }
}