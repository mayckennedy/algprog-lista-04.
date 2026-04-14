import java.util.Scanner;

public class Lista4exercicioUm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double nota = sc.nextDouble();

        System.out.println("Bem vindo:");

        
       do{    System.out.println("Digite uma nota entre 0 e 10");
        nota = sc.nextDouble();     
                
    
           if (nota < 0 || nota >10 ){
            System.out.println("Valor invalido!");
           }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);

        sc.close();

    }
}