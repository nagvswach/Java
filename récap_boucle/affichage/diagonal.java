import java.util.Scanner;
public class diagonal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        for(int i = 0; i < h; ++i){
            for(int j = 0; j < h; ++j){
                if( i == j || (j == h - 1 - i))
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
