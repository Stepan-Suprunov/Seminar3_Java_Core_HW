import java.util.List;

public class Director extends Employee {
    public Director(String name, double salary, Post post) {
        super(name, salary, post);
    }

    /**
     * Метод повышает зарплату всем сотрудникам, кроме руководителей (Director), на указанный процент.
     *
     * @param employees Список сотрудников.
     * @param percent   Процент, на который повысится зарплата.
     */
    public static void salaryRaise(List<Employee> employees, double percent) {
        double multiplier = percent / 100;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof Manager) {
                employees.get(i).setSalary(employees.get(i).getSalary() + (employees.get(i).getSalary() * multiplier));
            }
        }
    }
}
