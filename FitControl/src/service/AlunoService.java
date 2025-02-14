package service;

import model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private List<Aluno> listaAlunos = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrarAluno(String nome, String telefone, String email) {
        Aluno aluno = new Aluno(proximoId++, nome, telefone, email);
        listaAlunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void editarAluno(int id, String nome, String telefone, String email) {
        boolean alunoEncontrado = false;
        for (Aluno aluno : listaAlunos) {
            if (aluno.getIdAluno() == id) {
                aluno.setNome(nome);
                aluno.setTelefone(telefone);
                aluno.setEmail(email);
                alunoEncontrado = true;
                System.out.println("Aluno editado com sucesso!");
                break;
            }
        }
        if (!alunoEncontrado) {
            System.out.println("Aluno não encontrado!");
        }
    }

    public void excluirAluno(int id) {
        boolean alunoEncontrado = false;
        for (Aluno aluno : listaAlunos) {
            if (aluno.getIdAluno() == id) {
                listaAlunos.remove(aluno);
                alunoEncontrado = true;
                System.out.println("Aluno excluído com sucesso!");
                break;
            }
        }
        if (!alunoEncontrado) {
            System.out.println("Aluno não encontrado!");
        }
    }

    public void listarAlunos() {
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            listaAlunos.forEach(System.out::println);
        }
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }
}
