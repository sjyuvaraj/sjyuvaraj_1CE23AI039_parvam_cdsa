import java.util.List;
import java.util.stream.Collectors;


public class FilterName {
    public static void main(String[] args) {
        List<String> names = List.of("Akshay", "Ajay", "Bharath", "Akash", "Charan");


        System.out.println("List of Names:" + names);


        List<String> namesWithA = names.stream()
                                       .filter(name -> name.startsWith("A"))
                                       .collect(Collectors.toList());


        System.out.println("Names starting with Alphabet 'A':" + namesWithA);


        List<String> namesEndsWithY = names.stream()
                                       .filter(name -> name.endsWith("y"))
                                       .collect(Collectors.toList());


        System.out.println("Names ending with Alphabet 'y':" + namesEndsWithY);
    }
}
