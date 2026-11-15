import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int rotations = 0;
        char current = 'a';
        for (int i = 0; i<s.length(); i++){
            char target = s.charAt(i);
            int diff = Math.abs(target - current);
            int clockwise = diff;
            int counterClockwise = 26 - diff;
            rotations += Math.min(clockwise, counterClockwise);
            current = target;
        }
        System.out.println(rotations);
    }
}