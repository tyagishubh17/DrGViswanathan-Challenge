import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int totalSquares = n*m;
            int lanterns = (totalSquares + 1) / 2;
            System.out.println(lanterns);
        }
    }
}