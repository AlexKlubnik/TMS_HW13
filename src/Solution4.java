import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution4 {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("text13_2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("text13_2.txt",true))) {

            List<String> list = new ArrayList<>();
            String temp;

            while ((temp = reader.readLine()) != null) {
                list.addAll(Arrays.asList(temp));
            }

            Collections.reverse(list);
            writer.newLine();
            for (String s: list) {
                writer.write(s);
                writer.newLine();
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
