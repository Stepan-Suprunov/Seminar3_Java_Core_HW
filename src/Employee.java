import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Employee {
    private String name;
    private double salary;
    private Post post;

    protected enum Post {MANAGER, DIRECTOR}

    public Employee(String name, double salary, Post post) {
        this.name = name;
        this.salary = salary;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", post=" + post +
                '}';
    }

    public static List<Employee> employees = new ArrayList<>();

    public void addNewEmployee(Employee e) {
        employees.add(e);
    }

    public static Comparator<Employee> employeeComparator = Comparator.comparing(Employee -> Employee.getSalary());
}
