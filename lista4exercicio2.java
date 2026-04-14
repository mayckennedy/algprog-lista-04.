import java.util.Scanner;

public class lista4exercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;
        do {
            System.out.println("Digite o nome do usuario");
            usuario = sc.nextLine();
            System.out.println("Digite a senha");
            senha = sc.nextLine();
            if (senha.equalsIgnoreCase(usuario)){
                System.out.println("Erro: a senha não pode ser igual ao usuário!");
            }


        }while (senha.equalsIgnoreCase(usuario));{
            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("Seja bem vindo !");
            sc.close();
        }


    }
    
}
