import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = sc.next();
        int c = 1;
        for(int i=1; i<n; i++){
            String curr = sc.next();
            if (!curr.equals(prev)){
                c++;
            }
            prev = curr;
        }
        System.out.println(c);
    }
}