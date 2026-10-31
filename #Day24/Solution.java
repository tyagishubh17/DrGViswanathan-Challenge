import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String reverse_S = new StringBuilder(s).reverse().toString();
        if(reverse_S.equals(t)){
            System.out.println("YES");
        } 
	else{
            System.out.println("NO");
        }   
   }
}