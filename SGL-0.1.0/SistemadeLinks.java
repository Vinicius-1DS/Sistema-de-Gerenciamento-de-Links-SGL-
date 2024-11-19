// Classe SistemaLinks - Responsável por armazenar os links
import java.util.ArrayList;
import java.util.Scanner;

public class SistemadeLinks {
    private ArrayList<Link> links;

    // Construtor
    public SistemadeLinks() {
        links = new ArrayList<>();
    }

    // Adicionar link
    public void adicionarLink(String url, String descricao, String assunto) {
        Link link = new Link(url, descricao, assunto);
        links.add(link);
        System.out.println("Link adicionado com sucesso!\n");
    }

    // Listar todos os links
    public void listarLinks() {
        if (links.isEmpty()) {
            System.out.println("Nenhum link cadastrado ainda.\n");
        } else {
            System.out.println("Links cadastrados:");
            for (Link link : links) {
                System.out.println(link);
                System.out.println("--------------------------");
            }
        }
    }

    // Exibir o menu interativo
    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Menu do Sistema de Links ===");
            System.out.println("1. Adicionar Link");
            System.out.println("2. Listar Links");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("=== Adicionar Link ===");
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();

                    System.out.print("Digite a descrição: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Digite o assunto: ");
                    String assunto = scanner.nextLine();

                    adicionarLink(url, descricao, assunto);
                    break;

                case 2:
                    System.out.println("=== Listar Links ===");
                    listarLinks();
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
