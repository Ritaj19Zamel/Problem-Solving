import java.util.*;

public class StringTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String str = s.toLowerCase();
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'o' && str.charAt(i) != 'i' && str.charAt(i) != 'u' && str.charAt(i) != 'y' && str.charAt(i) != 'e') {
                System.out.print("."+str.charAt(i));

            }
        }

    }

}
