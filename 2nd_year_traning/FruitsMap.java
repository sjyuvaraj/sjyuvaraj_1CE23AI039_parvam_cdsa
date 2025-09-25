
import java.util.List;
import java.util.stream.Collectors;


public class FruitsMap {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "cherry", "strawberry", "grapes");


        System.out.println("Fruits in Lowercase:" + fruits);


        List<String> upperCase = fruits.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());


        System.out.println("Fruits in Uppercase:" + upperCase);
    }
}
