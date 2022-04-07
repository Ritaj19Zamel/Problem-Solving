package dominopiling;
import java.util.Scanner;
public class DominoPiling {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int m=s.nextInt();
        int n = s.nextInt();
        System.out.println((int)(Math.floor(n*m)/2));
        
    }
    
}
