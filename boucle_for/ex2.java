import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1;i < 11; ++i)
            System.out.println( i + "x" + n + "=" + n*i);

    }
}
