import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i=0; i<n; i++){
            heights[i] = sc.nextInt();
        }
        int maxSections=0;
        for (int i=0; i<n; i++){
            int currentSections=1;
            int left = i;
            while (left>0 && heights[left-1]<=heights[left]){
                currentSections++;
                left--;
            }
            int right=i;
            while (right<n-1 && heights[right+1]<=heights[right]){
                currentSections++;
                right++;
            }
            if (currentSections>maxSections){
                maxSections=currentSections;
            }
        }
        System.out.println(maxSections);
    }
}