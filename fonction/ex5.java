import java.util.Scanner;

public class ex5 {

    public static boolean pair(int a){
        return(a % 2 == 0);
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.print(pair(x));

    }
}
