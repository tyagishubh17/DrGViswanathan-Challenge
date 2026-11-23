import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next().toLowerCase();
        int count = 0;
        for (char c ='a'; c<= 'z'; c++){
            if(s.indexOf(c)!= -1){
                count = count + 1;
            }
        }
        if(count == 26){
            System.out.println("YES");
        } 
	else{
            System.out.println("NO");
        }
    }
}