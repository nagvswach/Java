import java.util.Scanner;

public class triangle_e {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        for(int i = 0; i < h; ++i){
            for(int j = 0; j < i + 1; ++j)
                System.out.print("X");
            System.out.println();
        }
    }
}
