package acessandoelementos;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeRegistry employeeRegistry = new EmployeeRegistry();
        employeeRegistry.addEmployee("João");
        employeeRegistry.addEmployee("Maria");
        employeeRegistry.addEmployee("Ana");
        employeeRegistry.addEmployee("Pedro");
        employeeRegistry.addEmployee("Antônio");

        System.out.println("A segunda pessoa da lista é: " + employeeRegistry.getSecondEmployee());
        System.out.println("Total de funcionários: " + employeeRegistry.getTotalEmployees());
    }
}
