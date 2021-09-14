import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MeuReaderCsv {
    private String arquivo;
    private static String separador;

    public static void usarVirgula(){  MeuReaderCsv.separador = ","; }
    public static void usarPontoVirgula(){  MeuReaderCsv.separador = ";"; }

    public MeuReaderCsv(String arquivo){
        MeuReaderCsv.usarPontoVirgula();
        this.setArquivo(arquivo);
    }

    public String lerLinha(){
        String lido  = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(this.getArquivo()));
            lido = in.readLine();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lido;
    }

    public static ArrayList<String> parseLinha(String linha){
        ArrayList<String> ret = new ArrayList<>();
        for (String campo: linha.split(MeuReaderCsv.separador)){
            ret.add(campo);
        }
        return ret;
    }

    public ArrayList<ArrayList<String>> lerTodoArquivo(){
        ArrayList<ArrayList<String>> ret = new ArrayList<>();
        String linha;
        try {
            BufferedReader in = new BufferedReader(new FileReader(this.getArquivo()));
            linha = in.readLine();
            while(linha != null){
                ret.add(MeuReaderCsv.parseLinha(linha));
                linha = in.readLine();
            };
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

    public String getArquivo(){ return this.arquivo + ".csv"; }
    public void setArquivo(String novo){ this.arquivo = novo; }
}
