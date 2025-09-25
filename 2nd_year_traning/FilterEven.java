import java.util.List;
import java.util.stream.Collectors;


public class FilterEven {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(13, 26, 34, 43, 56, 67, 76);


        System.out.println("List of Numbers: " + numbers);


        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());


        System.out.println("Filtered Even Numbers: " + evenNumbers);


   List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());


  System.out.println("Filtered Odd Numbers: " + oddNumbers);


    }
}
