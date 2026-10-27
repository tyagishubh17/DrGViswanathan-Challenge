import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i= 1; i<= 5;i++) {
            for (int c=1;c<= 5; c++){
                int val = sc.nextInt();
                if(val == 1){
                    System.out.println(Math.abs(i- 3)+Math.abs(c - 3));
                }
            }
        }
    }
}