package frisney.com.github;

import frisney.com.github.aluno.Aluno;
import frisney.com.github.aluno.Alunos;
import frisney.com.github.util.MeuReaderCsv;
import frisney.com.github.util.MeuWriterCsv;

import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {
        Alunos alunos = new Alunos();
//        do {
        alunos.add(new Aluno("Aluno1","aluno1@alunos.edu","1"));
        alunos.add(new Aluno("Aluno2","aluno2@alunos.edu","2"));
        alunos.add(new Aluno("Aluno3","aluno3@alunos.edu","3"));
        alunos.add(new Aluno("Aluno4","aluno4@alunos.edu","4"));
//        } while (true)

        MeuWriterCsv wrt = new MeuWriterCsv("alunos-origem");
        for (Aluno aluno: alunos) {
            wrt.adicionaCampo(aluno.getId());
            wrt.adicionaCampo(aluno.getNome());
            wrt.adicionaCampo(aluno.getEmail());
            wrt.adicionaCampo(aluno.getRa());
            wrt.novaLinha();
        }
        wrt.escrever();

        Alunos alunosLidos = new Alunos();

        MeuReaderCsv rd = new MeuReaderCsv("alunos-origem");
        for (ArrayList<String> alunoString:rd.lerTodoArquivo()){
            alunosLidos.add(new Aluno (
                Integer.parseInt(alunoString.get(0)),
                alunoString.get(1),
                alunoString.get(2),
                alunoString.get(3)
            ));
        }

        for (Aluno aluno: alunosLidos){
            System.out.println(aluno.toString());
        }
    }
}
