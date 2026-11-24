import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for(int i=0; i <n; i++){
            String s = sc.next();
            if(s.equals("Tetrahedron")){
                total = total +4;
            } else if (s.equals("Cube")){
                total = total + 6;
            } else if (s.equals("Octahedron")){
                total = total + 8;
            } else if (s.equals("Dodecahedron")) {
                total =total +12;
            } else if (s.equals("Icosahedron")) {
                total = total+20;
            }
        }
        System.out.println(total);
    }
}