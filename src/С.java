import java.util.Arrays;

public class С {
    public static void main(String[] args){
        String[] array = {"ab" , "aa" , "ad", "ac", "bd", "ba", "af"};
        Arrays.stream(array)
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}
