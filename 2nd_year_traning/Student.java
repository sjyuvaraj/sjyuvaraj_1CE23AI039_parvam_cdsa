public class Student {
    // data members (attributes)
    String name, branch, college, usn;
    int sem;
    char section;


    // member function/method (behavior)
    public void setValue(String Name, String Branch, String College, String USN, int Sem, char Sec){
        name = Name;
        branch = Branch;
        college = College;
        usn = USN;
        sem = Sem;
        section = Sec;
    }


    public void showValue() {
        System.out.println("My Details are as follows:");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + sem);
        System.out.println("Section: " + section);
        System.out.println("College: " + college);
    }
}
