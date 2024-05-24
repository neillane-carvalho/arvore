import java.util.Scanner;

public class MainDesafio {
    public static void main(String[] args) {
        Desafio tree = new Desafio();
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Inserir números na árvore");
            System.out.println("2 - Consultar os números inseridos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (count < 10) {
                        System.out.print("Digite um número: ");
                        int num = scanner.nextInt();
                        if (num > 0) {
                            tree.insert(num);
                            count++;
                            System.out.println("Número inserido com sucesso!");
                        } else {
                            System.out.println("Número inválido. Por favor, insira um número maior que zero.");
                        }
                    } else {
                        System.out.println("Limite de 10 números atingido.");
                    }
                    break;
                case 2:
                    System.out.print("Números inseridos (em ordem): ");
                    tree.inOrder();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
