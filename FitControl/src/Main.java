import service.AulaService;
import service.PagamentoService;
import service.AlunoService;
import service.RelatorioService;
import model.Aula;
import model.Pagamento;
import model.Aluno;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoService alunoService = new AlunoService(); // Instancia o serviço de alunos
        PagamentoService pagamentoService = new PagamentoService(); // Instancia o serviço de pagamentos
        AulaService aulaService = new AulaService(); // Instancia o serviço de aulas
        RelatorioService relatorioService = new RelatorioService(); // Instancia o serviço de relatórios
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== FitControl - Sistema de Controle de Alunos de Pilates ===");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Editar Aluno");
            System.out.println("3. Excluir Aluno");
            System.out.println("4. Listar Alunos");
            System.out.println("5. Cadastrar Pagamento");
            System.out.println("6. Listar Pagamentos");
            System.out.println("7. Cadastrar Aula");
            System.out.println("8. Listar Aulas");
            System.out.println("9. Gerar Relatório de Pagamentos");
            System.out.println("10. Gerar Relatório de Aulas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            String entrada = scanner.nextLine();

            try {
                opcao = Integer.parseInt(entrada);

                switch (opcao) {
                    case 1:
                        // Cadastrar Aluno
                        System.out.print("Digite o nome do aluno: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o telefone do aluno: ");
                        String telefone = scanner.nextLine();
                        System.out.print("Digite o email do aluno: ");
                        String email = scanner.nextLine();

                        alunoService.cadastrarAluno(nome, telefone, email);
                        System.out.println("Aluno cadastrado com sucesso!");
                        break;

                    case 2:
                        // Editar Aluno
                        System.out.print("Digite o ID do aluno a ser editado: ");
                        int idEditar = Integer.parseInt(scanner.nextLine());
                        System.out.print("Digite o novo nome do aluno: ");
                        String novoNome = scanner.nextLine();
                        System.out.print("Digite o novo telefone do aluno: ");
                        String novoTelefone = scanner.nextLine();
                        System.out.print("Digite o novo email do aluno: ");
                        String novoEmail = scanner.nextLine();

                        alunoService.editarAluno(idEditar, novoNome, novoTelefone, novoEmail);
                        System.out.println("Aluno editado com sucesso!");
                        break;

                    case 3:
                        // Excluir Aluno
                        System.out.print("Digite o ID do aluno a ser excluído: ");
                        int idExcluir = Integer.parseInt(scanner.nextLine());
                        alunoService.excluirAluno(idExcluir);
                        System.out.println("Aluno excluído com sucesso!");
                        break;

                    case 4:
                        // Listar Alunos
                        System.out.println("=== Lista de Alunos Cadastrados ===");
                        alunoService.listarAlunos(); // Chama o método que lista os alunos
                        break;

                    case 5:
                        // Cadastrar Pagamento
                        System.out.print("Digite o ID do aluno para o pagamento: ");
                        int idAlunoPagamento = Integer.parseInt(scanner.nextLine());
                        System.out.print("Digite o valor do pagamento: ");
                        double valorPago = Double.parseDouble(scanner.nextLine());
                        System.out.print("Digite a data do pagamento (AAAA-MM-DD): ");
                        String dataPagamentoStr = scanner.nextLine();

                        // Usando LocalDate para parse da data
                        java.time.LocalDate localDate = java.time.LocalDate.parse(dataPagamentoStr);
                        // Convertendo LocalDate para java.util.Date
                        java.util.Date dataPagamento = java.sql.Date.valueOf(localDate);

                        System.out.print("Digite o status do pagamento (Pendente/Pago): ");
                        String statusPagamento = scanner.nextLine();

                        pagamentoService.cadastrarPagamento(idAlunoPagamento, dataPagamento, valorPago, statusPagamento);
                        System.out.println("Pagamento cadastrado com sucesso!");
                        break;

                    case 6:
                        // Listar Pagamentos
                        System.out.println("=== Lista de Pagamentos ===");
                        pagamentoService.listarPagamentos(); // Chama o método que lista os pagamentos
                        break;

                    case 7:
                        // Cadastrar Aula
                        System.out.print("Digite o ID da aula: ");
                        int idAula = Integer.parseInt(scanner.nextLine());
                        System.out.print("Digite o nome da aula: ");
                        String nomeAula = scanner.nextLine();
                        System.out.print("Digite o horário da aula: ");
                        String horario = scanner.nextLine();
                        System.out.print("Digite o valor da aula: ");
                        double valor = Double.parseDouble(scanner.nextLine());

                        aulaService.cadastrarAula(idAula, nomeAula, horario, valor);
                        System.out.println("Aula cadastrada com sucesso!");
                        break;

                    case 8:
                        // Listar Aulas
                        System.out.println("=== Lista de Aulas ===");
                        List<Aula> aulas = aulaService.getAulas();
                        aulas.forEach(aula -> System.out.println(aula.getNomeAula()));
                        break;

                    case 9:
                        // Gerar Relatório de Pagamentos
                        System.out.println("=== Relatório de Pagamentos ===");
                        relatorioService.gerarRelatorioPagamentos(pagamentoService.getPagamentos());
                        break;

                    case 10:
                        // Gerar Relatório de Aulas
                        System.out.println("=== Relatório de Aulas ===");
                        relatorioService.gerarRelatorioAulas(aulaService.getAulas());
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
            } catch (IllegalArgumentException e) {
                System.out.println("Formato de data inválido. Use o formato AAAA-MM-DD.");
            }
        }

        scanner.close();
    }
}

/*.faltou fazer:
Implementar validações de entrada, especialmente para CPF e horários de aulas.
Completar funcionalidades pendentes:
Verificação de conflitos de horário ao agendar aulas.
Notificações de pendências financeiras.
Revisar o fluxo de cadastro e edição para melhorar a experiência do usuário.
Realizar testes com casos extremos (ex.: múltiplos alunos em horários semelhantes).*/
