package beautifulmatrix;

import java.util.*;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matrix[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = s.nextInt();

            }

        }
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == 1) {
                    System.out.println(Math.abs(3 - (r+1)) + Math.abs(3 - (c+1)));
                }
            }
        }

    }
}
