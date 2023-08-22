import java.util.Scanner;

public class Main {
    static Weg weg = new Weg();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        do {
            System.out.print("##------------WEG------------##\n\n");
            System.out.print("|---------------------------|\n");
            System.out.print("| -> 1 - Cadastrar Produto  |\n");
            System.out.print("| -> 2 - Cadastrar Servicos |\n");
            System.out.print("| -> 3 - Lista de Produtos  |\n");
            System.out.print("| -> 4 - Lista de Serviços  |\n");
            System.out.print("| -> 5 - Sair               |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1 -> cadastro();
                case 2 -> cadastroServicos();
                case 3 -> listarProdutos();
                case 4 -> listarServicos();
                case 5 -> System.exit(0);

            }
        }while (true);
    }
    public static void cadastro(){
        System.out.print("##----------WEG----------##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| -> 1 - Motor Eletrico         |\n");
        System.out.print("| -> 2 - Inversor de Frequência |\n");
        System.out.print("| -> 3 - Gerador                |\n");
        System.out.print("| -> 4 - Voltar                 |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1 -> cadastroMotor();
            case 2 -> cadastroInversor();
            case 3 -> cadastroGerador();
            case 4 -> menu();
        }
    }

    public static void cadastroMotor(){
        System.out.println("Nome do Motor:");
        String nome = sc.next();
        System.out.println("Codigo:");
        int cod = sc.nextInt();
        System.out.println("Tipo do Motor");
        String tipo = sc.next();
        System.out.println("Potencia do Motor");
        float pot = sc.nextFloat();
        System.out.println("Tensao do Motor");
        float tens = sc.nextFloat();
        System.out.println("Capacidade do Motor");
        float cap = sc.nextFloat();
        System.out.println("Preco");
        float prec = sc.nextFloat();
        System.out.println("Tipo de Enrolamento do Motor");
        String tip = sc.next();
        System.out.println("Eficiencia do Motor");
        String efi = sc.next();

        MotorEletrico mot = new MotorEletrico(nome, cod, tipo, pot, tens, cap,prec, tip, efi);
        weg.addProdutosDisponiveis(mot);
    }
    public static void cadastroInversor(){
        System.out.println("Nome do Inversor:");
        String nome = sc.next();
        System.out.println("Codigo:");
        int cod = sc.nextInt();
        System.out.println("Tipo do Inversor");
        String tipo = sc.next();
        System.out.println("Potencia do Inversor");
        float pot = sc.nextFloat();
        System.out.println("Tensao do Inversor");
        float tens = sc.nextFloat();
        System.out.println("Capacidade do Inversor");
        float cap = sc.nextFloat();
        System.out.println("Preco");
        float prec = sc.nextFloat();
        System.out.println("Capacidade de Frequencia:");
        String capa = sc.next();
        System.out.println("Numero de Fases");
        int num = sc.nextInt();

        InversorFrequencia inv = new InversorFrequencia(nome, cod, tipo, pot, tens, cap, prec, capa, num);
        weg.addProdutosDisponiveis(inv);
    }

    public static void cadastroGerador(){
        System.out.println("Nome do Gerador:");
        String nome = sc.next();
        System.out.println("Codigo:");
        int cod = sc.nextInt();
        System.out.println("Tipo do Gerador");
        String tipo = sc.next();
        System.out.println("Potencia do Gerador");
        float pot = sc.nextFloat();
        System.out.println("Tensao do Gerador");
        float tens = sc.nextFloat();
        System.out.println("Capacidade do Gerador");
        float cap = sc.nextFloat();
        System.out.println("Preco");
        float prec = sc.nextFloat();
        System.out.println("Gasolina");
        String gas = sc.next();
        System.out.println("Autonomia");
        float aut = sc.nextFloat();

        Gerador ger = new Gerador(nome, cod, tipo, pot, tens, cap,prec, gas, aut);
        weg.addProdutosDisponiveis(ger);
    }
    public static void cadastroServicos(){
        System.out.println("Descricao");
        String desc = sc.next();
        System.out.println("Preco");
        float prec = sc.nextFloat();

        ServicoManutencao serv = new ServicoManutencao(desc, prec);
        weg.addServicos(serv);
    }

    public static void listarProdutos(){
        int cont = 1;
        for(ProdutoWeg prod : weg.getProdutosDisponiveis()){
            System.out.println(cont +"° - "+ "Nome: "+ prod.getNome());
            System.out.println("Preco: "+prod.getPreco());
            System.out.println("");
            cont++;
        }
    }
    public static void listarServicos(){
        int cont = 1;
        for (ServicoManutencao serv : weg.getServicos()){
            System.out.println(cont+"° - "+" Descicao: "+ serv.getDescricao());
            System.out.println("Preco: "+ serv.getCusto());
            System.out.println("");
        }
    }

}
