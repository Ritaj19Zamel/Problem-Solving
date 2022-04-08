import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n1, n2, n3;
        int r = 0;
        while (t-- > 0) {
            int c = 0;
                    
            int[] count = {0, 0, 0};
            n1 = s.nextInt();
            n2 = s.nextInt();
            n3 = s.nextInt();
            if (n1 == 1) {
                count[0] = 1;
            }
            if (n2 == 1) {
                count[1] = 1;
            }
            if (n3 == 1) {
                count[2] = 1;
            }
            for (int i = 0; i < 3; i++) {
                if (count[i] == 1) {
                    c++;
                }

            }
            if (c > 1) {
                r++;

            }

        }
        System.out.println(r);
    }

}
