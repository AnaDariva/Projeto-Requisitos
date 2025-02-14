package model;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAluno {
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static int idCounter = 1;

    public static void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Foto (opcional): ");
        String foto = scanner.nextLine();

        Aluno aluno = new Aluno(idCounter++, nome, telefone, email);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void editarAluno(int idAluno) {
        Aluno aluno = alunos.stream().filter(a -> a.getIdAluno() == idAluno).findFirst().orElse(null);
        if (aluno != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Novo nome: ");
            aluno.setNome(scanner.nextLine());
            System.out.print("Novo telefone: ");
            aluno.setTelefone(scanner.nextLine());
            System.out.print("Novo e-mail: ");
            aluno.setEmail(scanner.nextLine());
            System.out.println("Cadastro atualizado!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    public static void excluirAluno(int idAluno) {
        alunos.removeIf(aluno -> aluno.getIdAluno() == idAluno);
        System.out.println("Aluno excluído com sucesso!");
    }

    public static void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("ID: " + aluno.getIdAluno() + ", Nome: " + aluno.getNome());
        }
    }

    public static void main(String[] args) {
        cadastrarAluno();
        listarAlunos();
    }
}
