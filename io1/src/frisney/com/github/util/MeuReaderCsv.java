package frisney.com.github.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MeuReaderCsv {
    private String arquivo;
    private String separador;

    public void usarVirgula(){  separador = ","; }
    public void usarPontoVirgula(){  separador = ";"; }

    public MeuReaderCsv(String arquivo){
        usarPontoVirgula();
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

    public ArrayList<String> parseLinha(String linha){
        ArrayList<String> ret = new ArrayList<>();
        for (String campo: linha.split(separador)){
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
                ret.add(parseLinha(linha));
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
