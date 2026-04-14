import java.util.Scanner;

public class Lista4exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, maior = Integer.MIN_VALUE;

        for ( int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i +"Numero:");
            numero = sc.nextInt();
        
        if(numero > maior) {
            maior = numero;
        } 
    }
    System.out.println("O maior numero é:" + maior);
    sc.close();

    }
    
}
