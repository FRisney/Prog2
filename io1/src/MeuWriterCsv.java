import java.io.*;

public class MeuWriterCsv {
    private String arquivo;
    private StringBuilder conteudo;
    private static char separador;

    public MeuWriterCsv(String arquivo){
        this.conteudo = new StringBuilder();
        this.setArquivo(arquivo);
        MeuWriterCsv.usarPontoVirgula();
    }
    public MeuWriterCsv(String arquivo, String conteudo){
        this.conteudo = new StringBuilder();
        this.setArquivo(arquivo);
        this.adicionaCampo(conteudo);
        MeuWriterCsv.usarPontoVirgula();
    }

    public void escrever(){
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(this.getArquivo(),true)));
            out.write(this.getConteudo() + '\n');
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getConteudo() {
        return conteudo.toString();
    }

    public void adicionaCampo(String campo){
        if (!this.conteudo.isEmpty()) this.conteudo.append(MeuWriterCsv.separador);
        this.conteudo.append(campo);
    }

    public void novaLinha() {
        this.conteudo.append('\n');
    }

    public static void usarVirgula(){  MeuWriterCsv.separador = ','; }
    public static void usarPontoVirgula(){  MeuWriterCsv.separador = ';'; }
    public String getArquivo(){ return this.arquivo + ".csv"; }
    public void setArquivo(String novo){ this.arquivo = novo; }
}
