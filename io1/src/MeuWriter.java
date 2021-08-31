import java.io.*;

public class MeuWriter {
    private String arquivo;
    private String conteudo;

    public MeuWriter(String arquivo){
        this.setArquivo(arquivo);
    }
    public MeuWriter(String arquivo, String conteudo){
        this.setArquivo(arquivo);
        this.setConteudo(conteudo);
    }

    public void escrever(){
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(this.getArquivo())));
            out.write(this.getConteudo());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getConteudo(){ return this.conteudo; }
    public void setConteudo(String novo){ this.conteudo = novo; }
    public String getArquivo(){ return this.arquivo; }
    public void setArquivo(String novo){ this.arquivo = novo; }
}
