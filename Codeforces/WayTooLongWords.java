
package waytoolongwords;
import java.lang.*;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n ; i++) {
        str[i] = s.next();
    }
        for(int i = 0 ; i<str.length ;i++){
            int len = str[i].length();
            char c1= str[i].charAt(0);
            char c2= str[i].charAt(len-1);
            if(len > 10)
            {
                System.out.println(Character.toString(c1)+(len-2)+Character.toString(c2));
            }
            else{
                System.out.println(str[i]);
            }
        }
        
    }
    
}
