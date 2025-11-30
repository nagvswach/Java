import java.util.Scanner;

public class ex11 {

    public static boolean est_premier(int a){
        boolean premier = true;
        int div = 2;
        while(premier && div < a){
            if(a % div == 0)
                premier = false;
            div += 1;
        }
        return(premier);
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.print(est_premier(x));

    }
}
