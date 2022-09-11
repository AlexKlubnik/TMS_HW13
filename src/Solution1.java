import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args){

        try (Scanner scanner = new Scanner (new FileReader("text13.txt"))) {

            List<String> words = new ArrayList<>();

            while (scanner.hasNext()) {
                String temp = scanner.next().replace(",", " ").trim();
                words.add(temp);
            }

            Collections.sort(words);

            System.out.println(words);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


}

