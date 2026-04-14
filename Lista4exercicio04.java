import java.util.Scanner;

public class Lista4exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double populacaoA = 80.000;
        double populacaoB = 200.000;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA = (populacaoA * 0.03);
            populacaoB = (populacaoB * 0.015);
            anos++;
            
        }
        System.out.println("Anos necessários: " + anos);
        System.out.printf("População final de A: %.2f\n", populacaoA);
        System.out.printf("População final de B: %.2f\n", populacaoB);
        sc.close();


    }
    
}
