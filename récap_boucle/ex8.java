import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nombre = s.nextInt();
        int suite = s.nextInt();
        int pos = 1; 
        while(nombre != suite){
            suite = s.nextInt();
            pos += 1;
        }
        System.out.print(pos);
    }
}
