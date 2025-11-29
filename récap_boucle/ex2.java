import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int current = 1;
        int prec = 1;
        System.out.print(prec + " "+ current+ " ");
        for(int i = 0; i < n - 2; ++i){
            int suivant = prec + current;
            System.out.print(suivant+ " ");
            prec = current; 
            current = suivant;
        }
    }
}
