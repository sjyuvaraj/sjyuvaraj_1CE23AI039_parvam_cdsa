public class Employee {
    String name, department;
    float experience;
    int employee_id;


    // Constructor
    // Same name as that of the Class
    // Default Constructor
    public Employee() {
        name = "N/A";
        department = "N/A";
        experience = 0;
        employee_id = 0;
        System.out.println("Constructor has been Invoked");
    }


    // Parameterized Constructor
    public Employee(String empName, String empDept, float empExp, int empID){
        name = empName;
        department = empDept;
        experience = empExp;
        employee_id = empID;
        System.out.println("Parameterized Constructor has initialized the values");
    }


    public void showEmpDetails(){
        System.out.println("Details of Employee " + employee_id + ":");
        System.out.println("Employee Name:" + name);
        System.out.println("Department:" + department);
        System.out.println("Experience:" + experience);
    }
}
