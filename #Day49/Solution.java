import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 0; tc < t; tc++) {
            String s = sc.next();
            int[] count = new int[10];
            for (int i = 0; i<10; i++) {
                int digit = s.charAt(i) - '0';
                count[digit] = count[digit] + 1;
            }
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i <10;i++){
                int needed = 9 - i;
                for (int d = needed; d<=9; d++){
                    if (count[d] > 0){
                        ans.append(d);
                        count[d] = count[d] - 1;
                        break;
                    }
                }
            }
            System.out.println(ans.toString());
        }
    }
}