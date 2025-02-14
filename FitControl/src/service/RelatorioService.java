package service;

import model.Aula;
import model.Pagamento;

import java.util.List;

public class RelatorioService {

    // Método para gerar relatório de aulas
    public void gerarRelatorioAulas(List<Aula> aulas) {
        if (aulas.isEmpty()) {
            System.out.println("Nenhuma aula registrada.");
        } else {
            System.out.println("=== Relatório de Aulas ===");
            for (Aula aula : aulas) {
                System.out.println("ID da Aula: " + aula.getIdAula());
                System.out.println("Nome da Aula: " + aula.getNomeAula());
                System.out.println("Horário: " + aula.getHorario());
                System.out.println("Valor: R$ " + aula.getValor());
                System.out.println("------------");
            }
        }
    }

    // Método para gerar relatório de pagamentos
    public void gerarRelatorioPagamentos(List<Pagamento> pagamentos) {
        if (pagamentos.isEmpty()) {
            System.out.println("Nenhum pagamento registrado.");
        } else {
            System.out.println("=== Relatório de Pagamentos ===");
            for (Pagamento pagamento : pagamentos) {
                System.out.println("ID do Aluno: " + pagamento.getAlunoId());
                System.out.println("Valor: R$ " + pagamento.getValorPago());
                System.out.println("Data do Pagamento: " + pagamento.getDataPagamento());
                System.out.println("Status: " + pagamento.getStatus());
                System.out.println("------------");
            }
        }
    }
}
