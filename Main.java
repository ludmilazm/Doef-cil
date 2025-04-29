/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Observer> observers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        observers.add(new InstituicaoObserver("DoeFácil"));

        int opcao;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1 - Cadastrar doação");
            System.out.println("2 - Listar doações");
            System.out.println("3 - Listar ordenado por nome");
            System.out.println("4 - Listar ordenado por categoria");
            System.out.println("5 - Cadastrar doação antiga");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarNovaDoacao(sc);
                case 2 -> listarDoacoes(null);
                case 3 -> listarDoacoes(new OrdenarPorNome());
                case 4 -> listarDoacoes(new OrdenarPorCategoria());
                case 5 -> cadastrarDoacaoAntiga(sc);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarNovaDoacao(Scanner sc) {
        System.out.print("Nome do item: ");
        String nome = sc.nextLine();
        System.out.print("Descrição: ");
        String descricao = sc.nextLine();
        System.out.print("Categoria: ");
        String categoria = sc.nextLine();

        Doacao nova = new Doacao(nome, descricao, categoria);
        RepositorioDoacoes.getInstancia().adicionarDoacao(nova);
        notificarObservers(nova);
        System.out.println("Doação cadastrada com sucesso!");
    }

    private static void listarDoacoes(OrdenacaoStrategy estrategia) {
        List<Doacao> lista = new ArrayList<>(RepositorioDoacoes.getInstancia().listarDoacoes());
        if (estrategia != null) estrategia.ordenar(lista);

        System.out.println("\n=== LISTA DE DOAÇÕES ===");
        for (Doacao d : lista) {
            System.out.println(d);
        }
    }

    private static void cadastrarDoacaoAntiga(Scanner sc) {
        System.out.print("Nome do item antigo: ");
        String nome = sc.nextLine();
        System.out.print("Detalhes: ");
        String detalhes = sc.nextLine();

        DoacaoAntiga antiga = new DoacaoAntiga(nome, detalhes);
        Doacao adaptada = new DoacaoAdapter(antiga);

        RepositorioDoacoes.getInstancia().adicionarDoacao(adaptada);
        notificarObservers(adaptada);
        System.out.println("Doação antiga cadastrada via adapter!");
    }

    private static void notificarObservers(Doacao doacao) {
        for (Observer o : observers) {
            o.notificar(doacao);
        }
    }
}
