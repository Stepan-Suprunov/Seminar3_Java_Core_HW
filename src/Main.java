public class Main {
    public static void main(String[] args) {

        Manager ban = new Manager("Ban", 100, Employee.Post.MANAGER);
        Manager sid = new Manager("Sid", 90, Employee.Post.MANAGER);
        Manager dave = new Manager("Dave", 110, Employee.Post.MANAGER);
        Director jacob = new Director("Jacob", 250, Employee.Post.DIRECTOR);
        Employee.employees.add(ban);
        Employee.employees.add(sid);
        Employee.employees.add(dave);
        Employee.employees.add(jacob);

        System.out.println(Employee.employees);
        System.out.println("------------------");
        Employee.employees.sort(Employee.employeeComparator);
        System.out.println(Employee.employees);
        System.out.println("------------------");
        Director.salaryRaise(Employee.employees, 30);
        System.out.println(Employee.employees);
        System.out.println("------------------");
    }
}