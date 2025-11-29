import java.util.Scanner;

public class ex3 {

    public static int max(int a, int b){
        int max;
        if(a > b)
            max = a;
        else
            max = b;
        return max;

    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.print(max(x, y));

    }
}
