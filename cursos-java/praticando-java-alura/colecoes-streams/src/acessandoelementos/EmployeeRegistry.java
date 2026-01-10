package acessandoelementos;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegistry {
    private final List<String> employees;

    public EmployeeRegistry() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String nome) {
        employees.add(nome);
    }

    public int getTotalEmployees() {
        return employees.size();
    }

    public String getSecondEmployee() {
        if (employees.size() < 2) {
            return "Não existe segundo funcionário";
        }
        return employees.get(1);
    }
}
