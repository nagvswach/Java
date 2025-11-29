import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nombre = s.nextInt();
        int total = 0;
        for(int i = 1; i < nombre + 1; ++i)
            total += i;
        System.out.print((double)total/nombre);
    }
}
