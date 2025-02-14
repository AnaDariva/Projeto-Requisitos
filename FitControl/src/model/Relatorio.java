class Relatorio {
    private int idRelatorio;
    private String tipoRelatorio;
    private String dataGeracao;

    public Relatorio(int idRelatorio, String tipoRelatorio, String dataGeracao) {
        this.idRelatorio = idRelatorio;
        this.tipoRelatorio = tipoRelatorio;
        this.dataGeracao = dataGeracao;
    }

    // Getters e Setters
    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getTipoRelatorio() {
        return tipoRelatorio;
    }

    public void setTipoRelatorio(String tipoRelatorio) {
        this.tipoRelatorio = tipoRelatorio;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }
}
