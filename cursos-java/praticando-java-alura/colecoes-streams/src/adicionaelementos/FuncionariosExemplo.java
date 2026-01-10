package adicionaelementos;

public class FuncionariosExemplo {
    public static void main(String[] args) {
        ListaFuncionarios funcionarios = new ListaFuncionarios();
        funcionarios.adicionarFuncionario("João");
        funcionarios.adicionarFuncionario("Maria");
        funcionarios.adicionarFuncionario("Vitor");
        funcionarios.adicionarFuncionario("Ana");

        funcionarios.imprimirLista();
    }
}
