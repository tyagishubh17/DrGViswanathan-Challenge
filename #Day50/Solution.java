import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n + 1];
        int[] r = new int[n + 1];
        for(int i=1;i<=n; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int lastEnd=0;
        for(int i=1;i<=n; i++){
            if(l[i]==0){
                if(lastEnd != 0){
                    r[lastEnd]=i;
                    l[i] =lastEnd;
                }
                int curr=i;
                while (r[curr] != 0){
                    curr=r[curr];
                }
                lastEnd=curr;
            }
        }
        for(int i=1; i<=n; i++){
            System.out.println(l[i] + " " + r[i]);
        }
    }
}