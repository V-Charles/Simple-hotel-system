package Program;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do primeiro hospede: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite a idade do primeiro hospede: ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do segundo hospede: ");
        String nome2 = sc.nextLine();
        System.out.print("Digite a idade do segundo hospede: ");
        int idade2 = sc.nextInt();
        sc.nextLine();

        if (idade2 > idade1) {
            String tempNome = nome1;
            nome1 = nome2;
            nome2 = tempNome;

            int tempIdade = idade1;
            idade1 = idade2;
            idade2 = tempIdade;
        }
        double desconto1 = (idade1 >= 60) ? 0.4 : 0;
        double preco1 = 1 - desconto1;
        
        double desconto2 = (idade2 >= 60) ? 0.4 : 0;
        double preco2 = 1 - desconto2;

        System.out.println("Quarto A: " + nome1 + " com desconto de " + (desconto1 * 100) + "%;"); 
        System.out.println("Quarto B: " + nome2 + " com desconto de " + (desconto2 * 100) + "%;");

        sc.close();
    }
}
