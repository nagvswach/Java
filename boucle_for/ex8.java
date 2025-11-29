import java.util.Scanner;


public class ex8{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int base = a;
        int b = s.nextInt();
        int it = (b > 0) ? b : -b;
        if(b == 0){
            if (a == 0)
                System.out.print(a);
            else
                System.out.print(1);
        }
        else{
            for(int i = 0; i < it-1; ++i)
                a = a*base;
            if(b > 0)
                System.out.print(a);
            else
                System.out.print((double)1/a);
        }
    }
}
