import java.util.ArrayList;
import java.util.Scanner;

public class SistemaLinks {
    private ArrayList<Link> links;

    // Construtor
    public SistemaLinks() {
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
 // Método para listar links por assunto
public void listarLinksPorAssunto(String assunto) {
    boolean encontrou = false;
    for (Link link : links) {
        if (link.getAssunto().equalsIgnoreCase(assunto)) {
            System.out.println(link);
            System.out.println("--------------------------");
            encontrou = true;
        }
    }
    if (!encontrou) {
        System.out.println("Nenhum link encontrado para o assunto: " + assunto + "\n");
    }
}

// Atualize o menu interativo para incluir a opção de filtrar por assunto
public void exibirMenu() {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("=== Menu do Sistema de Links ===");
        System.out.println("1. Adicionar Link");
        System.out.println("2. Listar Todos os Links");
        System.out.println("3. Filtrar Links por Assunto");
        System.out.println("4. Sair");
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
                System.out.println("=== Listar Todos os Links ===");
                listarLinks();
                break;

            case 3:
                System.out.println("=== Filtrar Links por Assunto ===");
                System.out.print("Digite o assunto: ");
                String assuntoFiltro = scanner.nextLine();
                listarLinksPorAssunto(assuntoFiltro);
                break;

            case 4:
                System.out.println("Saindo do sistema...");
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.\n");
        }
    } while (opcao != 4);

    scanner.close();
}
}

