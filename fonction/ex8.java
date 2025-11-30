import java.util.Scanner;

public class ex8 {

    public static int puissance(int a, int b){
        int current = a;
        int mult = a;
        if(b == 0)
            current = 1;
        else{
            for(int i = 0; i < b-1; ++i){
                for(int j = 0; j < a-1; ++j)
                    mult += current;
                current = mult;
                }
        }
        return current;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.print(puissance(x, y));

    }
}
