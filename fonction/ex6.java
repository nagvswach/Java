import java.util.Scanner;

public class ex6 {

    public static int mult(int a, int b){
        int res = 0;
        if(a > b){
            for(int i = 0;i < b; ++i)
                res += a;
        }
        else
            for(int i = 0; i < a; ++i)
                res += b;
        return res;


    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.print(mult(x, y));

    }
}
