import java.util.List;


public class AddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);


        System.out.println("List of Numbers: " + numbers);


        // Initially sum will be 0, we will traverse and add the alternative numbers and get the single result
        int sum = numbers.stream()
                         .reduce(0, (n1, n2) -> n1 + n2);


        System.out.println("Sum of Numbers: " + sum);
       
        int product = numbers.stream()
                             .reduce(1, (n1, n2) -> n1 * n2);
                             
        System.out.println("Product of Numbers: " + product);
    }
}
