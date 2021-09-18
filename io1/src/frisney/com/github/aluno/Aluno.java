package frisney.com.github.aluno;

public class Aluno {
    private Integer id;
    private String nome;
    private String email;
    private String ra;

    private static int lastId;

    public Aluno(String nome, String email, String ra){
        setId(newId());
        setNome(nome);
        setEmail(email);
        setRa(ra);
    }
    public Aluno(Integer id, String nome, String email, String ra){
        setId(id);
        setNome(nome);
        setEmail(email);
        setRa(ra);
    }

    public String getId() { return String.valueOf(id); }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRa() { return ra; }
    public void setRa(String ra) { this.ra = ra; }

    public int newId() { return ++lastId; }

    @Override
    public String toString() {
        return id + " - " + nome + " - " + email + " - " + ra;
    }
}
