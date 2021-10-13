import java.util.ArrayList;
import java.util.List;

public class B {
    public static void main(String[] args) {
        List<String> lastName = new ArrayList<>();
        lastName.add("Williams");
        lastName.add("Peters");
        lastName.add("Zachary");
        lastName.add("Gibson");
        lastName.add("Zeall");
        lastName.add("Jackson");
        lastName.add("Zouch");
        lastName.add("Jordan");

        lastName.stream()
                .filter(string -> string.startsWith("Z"))
                .forEach(System.out::println);

    }
}