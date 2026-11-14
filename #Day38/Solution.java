import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        int k = sc.nextInt();         int l = sc.nextInt();
        int c = sc.nextInt();        int d = sc.nextInt();         int p = sc.nextInt();
        int nl = sc.nextInt();       int np = sc.nextInt();
        int totalDrink = k*l;
        int toastsByDrink = totalDrink / nl;
        int toastsByLimes = c * d;
        int toastsBySalt = p / np;
        int minToasts = Math.min(toastsByDrink, Math.min(toastsByLimes, toastsBySalt));
        int ans = minToasts / n;
        System.out.println(ans);
    }
}