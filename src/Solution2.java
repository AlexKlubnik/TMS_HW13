import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution2 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("text13_1.txt"))) {

            Set<Integer> numbers = new HashSet<>();

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

            System.out.println(numbers);

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
