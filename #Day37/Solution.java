import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxVal = -1, minVal = 101;
        int maxIndex = 0, minIndex = 0;        
        for (int i = 0; i<n; i++){
            int a = sc.nextInt();
            if(a > maxVal){
                maxVal = a;
                maxIndex = i;
            }
            if(a <= minVal){
                minVal = a;
                minIndex = i;
            }
        }
        int ans = maxIndex + (n-1-minIndex);
        if(maxIndex > minIndex){
            ans--;
        }
        System.out.println(ans);
    }
}