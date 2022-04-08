import java.util.*;
public class NextRound {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n ,k;
        int count=0;
        n=s.nextInt();
        k=s.nextInt();
        int []p = new int[n+1];
        for(int i =1 ; i<n+1 ;i++)
        {
            p[0]=0;
            p[i]=s.nextInt();
        }
        for(int i =1 ;i<n+1 ;i++)
        {
            if(n == k)
            {
                
            }
            if(p[i] > p[k] || p[i] == p[k] && p[i] !=0)
                count++;
           
        }
        System.out.println(count);
    }
    
}
