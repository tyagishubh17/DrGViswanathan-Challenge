import java.util.*;
public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Set<Character> distinctChars = new HashSet<>();
		String s= sc.next();
        	for(int i = 0; i< s.length(); i++){
            		distinctChars.add(s.charAt(i));
       		}
        	if (distinctChars.size()%2== 0){
            		System.out.println("CHAT WITH HER!");
        	}
		else{
            		System.out.println("IGNORE HIM!");
        	}
	}
}