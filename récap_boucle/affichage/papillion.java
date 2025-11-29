import java.util.Scanner;

public class sablier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();

        for(int i = 0; i < h; ++i){
            for(int j = 0; j < h; ++j){

                if(i < h/2 + 1){   // partie haute
                    if(j >= i && j <= h-1-i){
                        System.out.print(" ");
                    } else {
                        System.out.print("X");
                    }

                } else {           // partie basse
                    if(j <= i && j >= h-1-i){
                        System.out.print(" ");
                    } else {
                        System.out.print("X");
                    }
                }

            }
            System.out.println();
        }
    }
}

