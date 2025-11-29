import java.util.Scanner;

public class ex4 {

    public static boolean pos(int a){
        return(a >= 0);
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.print(pos(x));

    }
}
