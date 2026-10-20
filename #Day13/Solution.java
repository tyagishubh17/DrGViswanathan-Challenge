import java.util.*;
public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder str1 = new StringBuilder(sc.nextLine());
		StringBuilder str2 = new StringBuilder();
		str2.append(Character.toUpperCase(str1.charAt(0)));
		str2.append(str1.substring(1));
		System.out.println(str2);
	}
}