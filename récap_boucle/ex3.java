import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int current = 1;
        int prec = 1;
        while(current < n){
            int suivant = prec + current;
            prec = current; 
            current = suivant;
            }
    System.out.print(prec);
    }
}
