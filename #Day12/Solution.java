import java.util.*;
public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] parts = str.split(" ");
		int n = Integer.parseInt(parts[0]);
		int k = Integer.parseInt(parts[1]);
		String scores_Line = sc.nextLine();
		String[] score_Parts = scores_Line.split(" ");
		int[] scores = new int[n];
		for(int i=0;i<n;i++){
			scores[i] = Integer.parseInt(score_Parts[i]);
		}
		int kthScore = scores[k-1];
		int count = 0;
        	for(int i=0;i<n;i++){
            		if (scores[i] >= kthScore && scores[i] > 0){
                		count++;
            		}
        	}
		
		System.out.println(count);
	}

}