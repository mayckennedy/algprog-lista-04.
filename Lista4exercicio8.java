import java.util.Scanner;

public class Lista4exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma;
        soma = 0;

        for (int i = 1; i <= 5; i ++){
            System.out.println("Digite o" + i + "numero:");
            numero = sc.nextInt();
            soma += numero;
        }

        double media = soma/ 5.0;

        System.out.println("Soma:" + soma);
        System.out.println("Media" + media);

        sc.close();
    }
    
}
