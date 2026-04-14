import java.util.Scanner;

public class Lista4exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("Números no intervalo:");

        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
