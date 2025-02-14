package model;

public class Aluno {
    private int idAluno;
    private String nome;
    private String telefone;
    private String email;
    private String foto; // Optional

    public Aluno(int idAluno, String nome, String telefone, String email) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.foto = foto;
    }

    // Getters and Setters

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    // Sobrescrevendo o método toString para exibir uma representação amigável do aluno
    @Override
    public String toString() {
        return "ID: " + idAluno + ", Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
