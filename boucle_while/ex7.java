import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nombre = s.nextInt();
        int current = 0;
        if(nombre == -1)
            System.out.print("pas de dernier");
        else{
            while(nombre != -1){
                current = nombre;
                nombre = s.nextInt();
            }
            System.out.print(current);
        }

    }
}
