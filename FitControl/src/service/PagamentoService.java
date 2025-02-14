package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import model.Pagamento;

public class PagamentoService {

    private List<Pagamento> pagamentos; // Lista de pagamentos armazenada

    public PagamentoService() {
        // Inicializa a lista de pagamentos
        pagamentos = new ArrayList<>();
    }

    // Método para cadastrar um pagamento
    public void cadastrarPagamento(int alunoId, Date dataPagamento, double valor, String status) {
        Pagamento pagamento = new Pagamento(); // Cria um novo objeto de pagamento
        pagamento.setAlunoId(alunoId); // Define o ID do aluno
        pagamento.setDataPagamento(dataPagamento); // Define a data do pagamento
        pagamento.setValorPago(valor); // Define o valor do pagamento
        pagamento.setStatus(status); // Define o status do pagamento

        pagamentos.add(pagamento); // Adiciona o pagamento à lista de pagamentos
        System.out.println("Pagamento cadastrado com sucesso!");
    }

    // Método para obter todos os pagamentos
    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    // Método para listar todos os pagamentos
    public void listarPagamentos() {
        if (pagamentos.isEmpty()) {
            System.out.println("Nenhum pagamento registrado.");
        } else {
            System.out.println("=== Lista de Pagamentos ===");
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
