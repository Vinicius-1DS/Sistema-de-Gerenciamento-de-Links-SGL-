import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class SistemaLinks_4 {
    private ArrayList<Link> links;
    private static final String ARQUIVO = "links.txt";
    
    // Construtor
    public SistemaLinks_4() {
        links = new ArrayList<>();
        

    }
    public void carregarLinks(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 3) {
                    String url = partes[0];
                    String descricao = partes[1];
                    String assunto = partes[2];
                    adicionarLink(url, descricao, assunto); // Reutiliza o método existente
                }
            }
            System.out.println("Links carregados com sucesso do arquivo!");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. Será criado um novo arquivo ao salvar.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar os links do arquivo: " + e.getMessage());
        }
    }
    
    public void salvarLinksEmArquivo(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Link link : links) {
                writer.write(link.getUrl() + ";" + link.getDescricao() + ";" + link.getAssunto());
                writer.newLine(); // Adiciona uma nova linha para cada link
            }
            System.out.println("Links salvos com sucesso no arquivo!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os links no arquivo: " + e.getMessage());
        }
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
// Método para remover link
public void removerLink(int indice) {
    if (indice >= 0 && indice < links.size()) {
        links.remove(indice);
        System.out.println("Link removido com sucesso!\n");
    } else {
        System.out.println("Índice inválido! Tente novamente.\n");
    }
}

public void exibirMenu() {
    carregarLinks("links.txt"); // Carrega links ao iniciar
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {System.out.println("=== Menu do Sistema de Links ===");
    System.out.println("1. Adicionar Link");
    System.out.println("2. Listar Todos os Links");
    System.out.println("3. Filtrar Links por Assunto");
    System.out.println("4. Remover Link");
    System.out.println("5. Sair");
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
                System.out.print("Digite o assunto para filtrar: ");
                String assuntoFiltro = scanner.nextLine();
                listarLinksPorAssunto(assuntoFiltro);
                break;

            case 4:
                System.out.println("=== Remover Link ===");
                listarLinks();
                System.out.print("Digite o índice do link para remover (começando em 0): ");
                int indice = scanner.nextInt();
                removerLink(indice);
                break;
            case 5:
                System.out.println("Salvando links e saindo...");
                salvarLinksEmArquivo("links.txt"); // Salva links ao sair
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    } while (opcao != 4);

    scanner.close();
}
}
