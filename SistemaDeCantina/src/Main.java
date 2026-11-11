import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- SISTEMA DA CANTINA ---");
            System.out.println("1. Cadastrar um produto");
            System.out.println("2. Listar todos os produtos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    int cod = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço unitário: R$ ");
                    double preco = scanner.nextDouble();

                    System.out.print("Digite a quantidade em estoque: ");
                    int qtd = scanner.nextInt();

                    Produto novoProduto = new Produto(cod, nome, preco, qtd);
                    listaProdutos.add(novoProduto);

                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE PRODUTOS ---");
                    if(listaProdutos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado ainda.");
                    } else {
                        for (int i = 0; i < listaProdutos.size(); i++) {
                            Produto p = listaProdutos.get(i);
                            System.out.println("Cód: " + p.codigo + " | Nome: " + p.nome +
                                    " | Preço: R$" + p.precoUnitario +
                                    " | Estoque: " + p.quantidadeEstoque);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}