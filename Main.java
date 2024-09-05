import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        biblioteca.adicionarLivro(new Livro("Harry Potter", "JK Rowling"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        biblioteca.adicionarUsuario(new Usuario("Matheus"));
        biblioteca.adicionarUsuario(new Usuario("Marcos"));

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Alugar Livro");
            System.out.println("2 - Devolver Livro");
            System.out.println("3 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do usuário: ");
                String nomeUsuario = scanner.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if (usuario != null) {
                    System.out.println("Digite o título do livro: ");
                    String tituloLivro = scanner.nextLine();
                    Livro livro = biblioteca.buscarLivro(tituloLivro);

                    if (livro != null) {
                        usuario.alugarLivro(livro);
                    } else {
                        System.out.println("Livro não encontrado");
                    }
                } else {
                    System.out.println("Usuário não encontrado");
                }
            } else if (opcao == 2) {
                System.out.println("Digite o nome do usuário:");
                String nomeUsuario = scanner.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if (usuario != null) {
                    usuario.devolverLivro();
                } else {
                    System.out.println("Usuário não encontrado");
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}
