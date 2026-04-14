import java.util.Scanner;

public class Lista4exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Numeros impares de 1 a 50");

        for(i = 1; i <= 50; i ++){
           if ( i % 2 != 0){
            System.out.println( i + " " );
           }
           sc.close();
    }   }
    
}
