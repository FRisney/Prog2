import java.util.ArrayList;
import java.util.Scanner;

public class MeuIO {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo:\n\t");
        String arq = scn.nextLine();
        MeuWriterCsv escritor = new MeuWriterCsv(arq);
        MeuReaderCsv leitor = new MeuReaderCsv(arq);
        String opt;
        do{
            System.out.print("Ler(1), escrever(2), nova linha(3):\n\t");
            opt = scn.nextLine();
            if (opt.equals("3")) {
                escritor.novaLinha();
            } else if (opt.equals("2")){
                System.out.print("Digite o que sera escrito no arquivo:\n\t");
                escritor.adicionaCampo(scn.nextLine());
            } else if (opt.equals("1")){
                System.out.println("No arquivo foi escrito:");
                for (ArrayList<String> linha : leitor.lerTodoArquivo()) {
                    System.out.println(linha);
                }
            }
        }while (opt.equals("3") || opt.equals("2") || opt.equals("1"));
        escritor.escrever();
    }
}