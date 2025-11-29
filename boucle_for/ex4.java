import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int it = s.nextInt();
        int nombre = s.nextInt();
        int min = nombre;
        for(int i = 0; i < it - 1; ++i){
            nombre = s.nextInt();
            if(min > nombre)
                min = nombre;
        }
        System.out.print(min);
    }
}
