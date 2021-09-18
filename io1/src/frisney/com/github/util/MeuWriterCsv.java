package frisney.com.github.util;

import java.io.*;
import java.util.ArrayList;

public class MeuWriterCsv {
    private String arquivo;
    private ArrayList<StringBuilder> conteudo;
    private char separador;
    private int currentLine = 0;

    public MeuWriterCsv(String arquivo){
        this.conteudo = new ArrayList<>();
        this.conteudo.add(new StringBuilder());
        this.setArquivo(arquivo);
        usarPontoVirgula();
    }

    public void escrever(){
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(this.getArquivo(),true)));
            for (StringBuilder linha: conteudo) {
                if (linha.isEmpty()) continue;
                out.write(linha.toString() + '\n');
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void adicionaCampo(String campo){
        StringBuilder sb = conteudo.get(currentLine);
        sb.append(campo).append(separador);
        conteudo.set(currentLine,sb);
    }

    public void novaLinha() {
        StringBuilder sb = conteudo.get(currentLine);
        sb.deleteCharAt(
            sb.lastIndexOf(
                String.valueOf(separador)
            )
        );
        conteudo.set(currentLine++,sb);
        conteudo.add(new StringBuilder());
    }

    public void usarVirgula(){  this.separador = ','; }
    public void usarPontoVirgula(){  this.separador = ';'; }
    public String getArquivo(){ return this.arquivo + ".csv"; }
    public void setArquivo(String novo){ this.arquivo = novo; }
}
