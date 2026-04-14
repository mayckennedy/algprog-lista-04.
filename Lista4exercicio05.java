import java.util.Scanner;

public class Lista4exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double populacaoA, populacaoB;
        double taxaA, taxaB;
        int anos;
        char resposta;

        do{
            anos = 0;
            System.out.println("População A:");
            populacaoA = sc.nextDouble();
            System.out.println("Taxa de crescimento população A");
            taxaA = sc.nextDouble();

            System.out.println("População B");
            populacaoB = sc.nextDouble();
            System.out.println("Taxa de crescimento população B");
            taxaB = sc.nextDouble();

            if (populacaoA <= 0 || populacaoB <= 0 || taxaA <= 0 || taxaB <= 0 ){
                System.out.println("Valores invalidos! Tente novamente. ");
                continue;

            }
        }
         while (populacaoA < populacaoB); {
            populacaoA += (populacaoA * taxaA);
            populacaoB += (populacaoB * taxaB);
            anos++;
        
     
        System.out.println("Anos necessarios:" + anos);
        System.out.println("População final de A:" + populacaoA);
        System.out.println("População final de B:" + populacaoB);
        System.out.println(" Deseja repetir ? (s/n):");
        resposta = sc.next().charAt(0);}

         while (resposta == 'S'|| resposta == 's');
         
        System.out.println("Final");
        sc.close();


    }
}
    

