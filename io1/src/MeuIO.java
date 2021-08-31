import java.util.Scanner;

public class MeuIO {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo:\n\t");
        MeuWriter escritor = new MeuWriter(scn.nextLine());
        MeuReader leitor = new MeuReader(escritor.getArquivo());
        System.out.print("Digite o que sera escrito no arquivo:\n\t");
        escritor.setConteudo(scn.nextLine());
        escritor.escrever();
        System.out.print("No arquivo foi escrito:\n\t");
        System.out.println(leitor.lerLinha());
    }
}