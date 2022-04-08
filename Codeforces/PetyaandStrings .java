import java.util.*;
public class PetyaandStrings {
    public static int compareTo(String s1 ,String s2)
    {
        if(s1.compareTo(s2)==0)
        {
            return 0;
        }
        else if(s1.compareTo(s2)<0)
        {
            return -1;
        }
        else{
        return 1;
    }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        System.out.println(compareTo(s1.toLowerCase(),s2.toLowerCase()));
       
    }
    
}
