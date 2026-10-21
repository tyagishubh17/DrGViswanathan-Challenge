import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] s_new = s.split("\\+");
        Arrays.sort(s_new);
        System.out.println(String.join("+", s_new));
    }
}