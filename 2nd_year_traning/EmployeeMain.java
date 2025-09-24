public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Akshay Rao", "Technical Training", 3.3f, 1);
        emp1.showEmpDetails();
        Employee emp2 = new Employee("Pavan", "Quality Assessment", 2.1f, 2);
        emp2.showEmpDetails();
        Employee emp3 = new Employee("Murthy", "Full Stack Developer", 1.5f, 3);
        emp3.showEmpDetails();
        Employee emp4 = new Employee();
  emp4.showEmpDetails();
    }
}