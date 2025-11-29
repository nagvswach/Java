import java.util.Scanner;

public class triangle_i {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int limites = h * 2 - 1;
        int centre = limites/2;
        for(int i = 0; i < h; ++i){
            for(int j = 0; j < limites; ++j){
                if(j < centre - i || j > centre +i)
                    System.out.print(" ");
                else
                    System.out.print("X");
            }
            System.out.println();
        }
    }
}
