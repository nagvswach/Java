import java.util.Scanner;

public class ex7 {

    public static int puissance(int a, int b){
        int res = 1;
        if(b ==0)
            res = 1;
        else
            for(int i = 0; i < b; ++i)
                res = res*a;
        return res;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.print(puissance(x, y));

    }
}
