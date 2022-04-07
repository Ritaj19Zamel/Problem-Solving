package bit;

import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n = 0;
        while (t-- > 0) {

            String str = s.next();
            if (str.equals("++X")||str.equals("X++")) {
                ++n;
            } else if (str.equals("--X")||str.equals("X--")) {
                --n;
            }
        }
        System.out.println(n);
    }

}
