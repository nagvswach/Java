import java.util.Scanner;

public class ex9 {

    public static int fact(int a){
        int res = 1;
        if(a == 0 || a == 1)
            res = 1;
        else
            for(int i = 1; i < a + 1; ++i)
                res = res * i; 
        return res;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.print(fact(x));

    }
}
