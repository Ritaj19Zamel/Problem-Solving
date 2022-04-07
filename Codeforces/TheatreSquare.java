
package theatresquare;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        long m , n ,a;
        m=s.nextLong();
        n=s.nextLong();
        a=s.nextLong();
        
        if(n%a==0 && m%a==0)
        {
            System.out.println((n/a)*(m/a));
        }
        else if(n%a!=0 && m%a==0)
        {
            System.out.println(((n/a)+1)*(m/a));
        }
        else if(n%a==0 && m%a!=0)
        {
            System.out.println((n/a)*((m/a)+1));
        }
        else{
            System.out.println(((n/a)+1)*((m/a)+1));
        }
        
    }
    
}
