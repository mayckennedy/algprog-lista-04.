import java.util.Scanner;

public class Lista4exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo, estadocivil;

        do {
            System.out.println("Qual seu nome ?");
            nome = sc.nextLine();
        }while (nome.length() <= 3);
        do { 
            System.out.println("Qual sua idade ?");
            idade = sc.nextInt();
            
        }while (idade < 0 || idade > 150); 

        do { 
            System.out.println("Salario (> 0 ):");
            salario = sc.nextDouble();
        } while (salario <= 0);
        do {
            System.out.println("Sexo ( 'f' ou 'm'): ");
            sexo = sc.next().toLowerCase().charAt(0);
        }while (sexo != 'f' && sexo != 'm');

        do{
            System.out.println("Estado civil: 's' 'c' 'd' 'v':");
            estadocivil= sc.next().toLowerCase().charAt(0);
        }while (estadocivil != 's' && estadocivil != 'c' && estadocivil != 'v' && estadocivil != 'd');
            
            

        
            System.out.println("Dados validos cadastrados:");
            

            sc.close();
        }
            
        
            
        
            
        
        
    }
    

    

