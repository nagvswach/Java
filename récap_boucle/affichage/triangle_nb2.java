
import java.util.Scanner;

public class triangle_nb2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int longueur = 2 * h;
        
        for (int i = 0; i < h; ++i) {
            int current = 0;

            for (int j = 0; j < longueur; ++j) {

                if (j >= i && j < longueur - i) {

                    if (j < longueur / 2) {
                        current += 1;
                        System.out.print(current);
                    } else {
                        System.out.print(current);
                        current -= 1;
                    }

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        s.close();
    }
}
