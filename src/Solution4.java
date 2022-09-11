import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("text13_2.txt"));
             FileWriter writer = new FileWriter("text13_2.txt", true)) {

            List<String> text = new ArrayList<>();

            while (scanner.hasNextLine()) {
                text.add(scanner.nextLine());
            }

            Collections.reverse(text);

            for (String s : text) {
                writer.write("\n" + s);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
