import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nombre = s.nextInt();
        int total = 0;
        int current = 1;
        while((total + current) < nombre){
            total += current;
            current += 1;
        }   
        System.out.print(total);
    }
}
