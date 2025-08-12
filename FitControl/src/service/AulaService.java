package service;

import model.Aula;
import java.util.ArrayList;
import java.util.List;

public class AulaService {

    private List<Aula> aulas;

    public AulaService() {
        aulas = new ArrayList<>();
    }

    // Método para cadastrar uma aula
    public void cadastrarAula(int idAula, String nomeAula, String horario, double valor) {
        Aula aula = new Aula();
        aula.setIdAula(idAula);
        aula.setNomeAula(nomeAula);
        aula.setHorario(horario);
        aula.setValor(valor);

        aulas.add(aula);
        System.out.println("Aula cadastrada com sucesso!");
    }

    // Método para obter todas as aulas cadastradas
    public List<Aula> getAulas() {
        return aulas;
    }
}



