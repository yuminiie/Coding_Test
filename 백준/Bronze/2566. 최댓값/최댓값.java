import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int Max = Integer.MIN_VALUE;
        int ii = 0;
        int jj = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j< 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j< 9; j++){
                if(arr[i][j] > Max){
                    Max = arr[i][j];
                    ii = i + 1;
                    jj = j + 1;
                }
            }
        }
        System.out.println(Max);
        System.out.println(ii + " " + jj);
    }
}