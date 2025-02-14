package model;

import java.util.Date;

public class Matricula {
    private int idMatricula;
    private Date dataMatricula;
    private String statusMatricula; // "Ativa", "Cancelada"
    private Aluno aluno;
    private Aula aula;

    // Construtores, getters e setters
    public Matricula(int idMatricula, Date dataMatricula, String statusMatricula, Aluno aluno, Aula aula) {
        this.idMatricula = idMatricula;
        this.dataMatricula = dataMatricula;
        this.statusMatricula = statusMatricula;
        this.aluno = aluno;
        this.aula = aula;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
}
