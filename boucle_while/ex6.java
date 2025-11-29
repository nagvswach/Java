import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int current = 1;
        while(current*current < n){
            System.out.print(current + " ");
            current += 1;
        }
    }
}
