import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nombre = s.nextInt();
        int min = nombre;
        if(nombre == 0)
            System.out.print("pas de suite");
        else{
            while(nombre != 0){
                nombre = s.nextInt();
                if(nombre < min && nombre != 0)
                    min = nombre;
            }
            System.out.print(min);
        }
    }
}
