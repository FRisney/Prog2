package frisney.com.github.aluno;

import java.util.ArrayList;
import java.util.Iterator;

public class Alunos implements Iterable<Aluno>{
    private Integer index;
    ArrayList<Aluno> alunos;

    public Alunos(){
        index = 0;
        alunos = new ArrayList<>();
    }

    public void add(Aluno aluno){
        this.alunos.add(aluno);
    }

    @Override
    public Iterator<Aluno> iterator() {
        return new AlunosIterator<>(this.alunos);
    }

    class AlunosIterator<T> implements Iterator<T> {
        private int index;
        private ArrayList<T> internal;

        public AlunosIterator(ArrayList<T> list){ this.internal = list; this.index = 0; }

        @Override
        public boolean hasNext() { return this.internal.size() >= this.index + 1; }

        @Override
        public T next() { return this.internal.get(this.index++); }
    }
}
