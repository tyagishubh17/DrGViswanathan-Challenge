import java.util.*;
public class Solution{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i=0;i<n;i++){
	String word = sc.next();
		if(word.length()>10){
			char firstChar = word.charAt(0);
			char lastChar = word.charAt(word.length()-1);
			int replacement = word.length()-2;
			String result = ""+ firstChar + replacement + lastChar;
			System.out.println(result);
		}
		else{
			System.out.println(word);
			}
	}
}
}