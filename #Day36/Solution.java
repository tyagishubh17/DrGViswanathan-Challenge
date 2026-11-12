import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (m*a <= b){
            System.out.println(n*a);
        } 
	else{
            int tickets = n / m;
            int remainder = n % m;
            int cost = tickets*b + Math.min(remainder*a, b);
            System.out.println(cost);
        }
        
    }
}