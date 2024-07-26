import java.util.Scanner;

public class MochilaDoPedro {
    private int limitePeso;
    private int somaPeso;
    private int[] peso;
    private String[] tamanho;

    public MochilaDoPedro() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite quantos quilos a mochila aguentará: ");
        limitePeso = s.nextInt();
        System.out.println("Digite quantos lugares a mochilá terá: ");
        int tamanhos = s.nextInt();
        peso = new int[tamanhos];
        tamanho = new String[tamanhos];
        somaPeso = 0;
        Escolha();
        s.close();
    }

    public static void MostrarMenu(){
        System.out.println("==================");
        System.out.println("Digite sua opção: ");
        System.out.println("1 - Inserir");
        System.out.println("2 - Imprimir Mochila");
        System.out.println("3 - Valor Item Mais Pesado");
        System.out.println("4 - Ordenar Mochila");
        System.out.println("5 - Excluir Item Mochila");
        System.out.println("6 - Sair");
        System.out.println("==================");
    }

    public void Escolha() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            MostrarMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    PerguntarPeso(scanner);
                    break;
                case 2:
                    ImprimirMochila();
                    break;
                case 3:
                    ValorMaisPesado();
                    break;
                case 4:
                    OrdenarMochila();
                    break;
                case 5:
                    ExcluirItemMochila(scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opcao != 6);
    }

    public void OrdenarMochila() {
        for (int a = 0; a < peso.length - 1; a++) {
            for (int i = 0; i < peso.length - 1 - a; i++) {
                if (peso[i] > peso[i + 1]) {
                    int bolhaPesos = peso[i];
                    peso[i] = peso[i + 1];
                    peso[i + 1] = bolhaPesos;

                    String bolhaMochila = tamanho[i];
                    tamanho[i] = tamanho[i + 1];
                    tamanho[i + 1] = bolhaMochila;
                }
            }
        }
        RespostaObjeto();
        RespostaPeso();
    }

    public void ExcluirItemMochila(Scanner s) {
        System.out.println("Digite o índice do item a ser excluído (1-" + peso.length + "): ");
        int indice = s.nextInt() - 1;
        if (indice >= 0 && indice < peso.length && peso[indice] != 0) {
            somaPeso -= peso[indice];
            peso[indice] = 0;
            tamanho[indice] = null;
            System.out.println("Item excluído.");
        } else {
            System.out.println("Índice inválido ou item já está vazio.");
        }
    }

    public void ValorMaisPesado() {
        int maior = 0;
        for (int p : peso) {
            if (p > maior) {
                maior = p;
            }
        }
        System.out.println("O valor mais pesado tem peso: " + maior);
    }

    public void ImprimirMochila() {
        System.out.print("Pesos: ");
        for (int i = peso.length - 1; i >= 0; i--){
            System.out.print("[" + peso[i] + "] ");
        }
        System.out.println();
        System.out.print("Objetos: ");
        for (int i = peso.length - 1; i >= 0; i--){
            System.out.print("[" + tamanho[i] + "] ");
        }
        System.out.println();
    }

    public void PerguntarPeso(Scanner s) {
        for (int i = 0; i < peso.length; i++) {
            if (peso[i] == 0) {
                System.out.println("Digite o " + (i + 1) + "º peso: ");
                int p = s.nextInt();
                if (somaPeso + p > limitePeso) {
                    System.out.println("Peso Acima! Tente novamente.");
                } else {
                    peso[i] = p;
                    somaPeso += p;
                    PerguntarObjeto(s, i);
                }
                break;
            }
        }
        RespostaPeso();
        RespostaObjeto();
    }

    public void PerguntarObjeto(Scanner s, int i) {
        System.out.println("Digite o " + (i + 1) + "º objeto: ");
        tamanho[i] = s.next();
    }

    public void RespostaPeso() {
        System.out.println("==================");
        System.out.print("Pesos: ");
        for (int p : peso) {
            System.out.print("[" + p + "] ");
        }
        System.out.println();
    }

    public void RespostaObjeto() {
        System.out.print("Objetos: ");
        for (String t : tamanho) {
            System.out.print("[" + t + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new MochilaDoPedro();
    }
}
