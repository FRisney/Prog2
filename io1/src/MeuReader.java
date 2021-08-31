import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MeuReader {
    private String arquivo;

    public MeuReader(String arquivo){
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

    public String getArquivo(){ return this.arquivo; }
    public void setArquivo(String novo){ this.arquivo = novo; }
}
