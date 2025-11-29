import java.util.Scanner;

public class triangle_nb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();

        for (int i = 0; i < h; ++i) {
            for (int sp = 0; sp < i; ++sp) {
                System.out.print(" ");
            }

            int max = h - i;

            for (int j = 1; j <= max; ++j) {
                System.out.print(j);
            }

            for (int j = max; j >= 1; --j) {
                System.out.print(j);
            }

            System.out.println();
        }

        s.close();
    }
}
