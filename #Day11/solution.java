import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i=0; i<str.length();i++){
            char c = str.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='i' || c=='y'){
                continue; 
            } 
	    else{
                result.append('.').append(c);
            }
        }
        System.out.println(result.toString());
    }
}