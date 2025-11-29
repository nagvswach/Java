import java.util.Scanner;

public class ex2 {

    public static double moy(int a, int b){
        return (a + b)/2.0;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.print(moy(x, y));

    }
}
