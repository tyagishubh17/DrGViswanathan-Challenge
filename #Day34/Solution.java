import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int len = n.length();
        int ans = (int) Math.pow(2, len) - 2;
        for(int i = 0; i < len; i++) {
            if(n.charAt(i) == '7') {
                ans += (int) Math.pow(2, len-i-1);
            }
        }
        System.out.println(ans + 1);
    }
}