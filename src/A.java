import java.util.stream.Stream;

public class A {
    public static void main(String[] args) {
        long result = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter((integer) -> integer % 2 == 0)
                .count();
        System.out.println(result);
    }
}
