import java.util.Scanner;

public class contour_carre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();

        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < h; ++j) {
                if (i == 0 || i == h-1 || j == 0 || j == h-1)
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

