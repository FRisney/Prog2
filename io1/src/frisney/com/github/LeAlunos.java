package frisney.com.github;

import frisney.com.github.aluno.Aluno;
import frisney.com.github.aluno.Alunos;
import frisney.com.github.util.MeuReaderCsv;
import frisney.com.github.util.MeuWriterCsv;

import java.util.ArrayList;

public class LeAlunos {

    public static void main(String[] args) {
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
