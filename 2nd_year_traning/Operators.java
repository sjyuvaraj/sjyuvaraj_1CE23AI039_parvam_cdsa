public class Operators {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 33;


        // Arithmetic Operators: +, -, *, /, %
        System.out.println("Addition: " + num1 + " + " + num2 + ": " + (num1 + num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + ": " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + ": " + (num1 * num2));
        System.out.println("Division (Quotient): " + num2 + " / " + num2 + ": " + (num1 / num2));
        System.out.println("Division (Remainder/Modulus): " + num2 + " % " + num1 + ": " + (num1 % num2));


        // Relational Operators: >, <, <=, >=, ==, !=
        System.out.println("Greater than: " + num1 + " > " + num2 + ": " + (num1 > num2));
        System.out.println("Lesser than: " + num1 + " < " + num2 + ": " + (num1 < num2));
        System.out.println("Greater than and Equal to: " + num1 + " >= " + num2 + ": " + (num1 >= num2));
        System.out.println("Lesser than and Equal to: " + num1 + " <= " + num2 + ": " + (num1 <= num2));
        System.out.println("Equal to: " + num1 + " == " + num2 + ": " + (num1 == num2));
        System.out.println("Not Equal to: " + num1 + " != " + num2 + ": " + (num1 != num2));


        // Ternary Operator: condition ? True : False
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum Value: " + max);


        boolean evenOrOdd = (num1 % 2 == 0) ? true : false;
        System.out.println("Number 1 is Even: " + evenOrOdd);


        boolean check = (num2 % 2 == 0) ? true : false;
        System.out.println("Number 2 is Even: " + check);
    }
}
