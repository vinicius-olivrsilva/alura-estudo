public class ControleTarefas {
    private String descricao;
    private boolean concluida;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void imprimeTarefas() {
        String status = concluida ? "Concluída" : "Pendente";
        System.out.println("Tarefa: " + descricao + " - " + "Status: " + status);
    }
}
