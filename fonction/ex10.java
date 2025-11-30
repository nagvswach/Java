import java.util.Scanner;

public class ex10 {

    public static boolean multiple(int a, int b){
        int res;
        if(a > b)
            res = a % b;
        else
            res = b % a;
        return(res == 0);
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.print(multiple(x,y));

    }
}
