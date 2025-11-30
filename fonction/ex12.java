import java.util.Scanner;

public class ex12 {

    public static int premier(int a){
        int div = 2;
        int avant = 0;
        for(int i = a - 1; i > 0; --i){
            boolean premier = true;
            while(premier && div < i){
                if(i % div == 0)
                    premier = false;
                div += 1;
            }
            if(premier)
                return i;
        }
       return avant;
}

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.print(premier(x));

    }
}
