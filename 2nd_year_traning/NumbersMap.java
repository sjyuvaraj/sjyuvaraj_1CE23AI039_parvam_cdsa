import java.util.List;
import java.util.stream.Collectors;


public class NumbersMap {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);


        System.out.println("Numbers: " + numbers);


        List<Integer> multiply2 = numbers.stream()
                                         .map(n -> n * 2)
                                         .collect(Collectors.toList());


        System.out.println("Numbers multiplied by 2: " + multiply2);
    }
}
