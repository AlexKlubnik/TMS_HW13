import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("text13.txt"))) {

            List<String> list = new ArrayList<>();

            String temp;

            while ((temp = reader.readLine()) != null) {
                list.addAll(Arrays.asList(temp.split("\\W")));
            }
            Collections.sort(list);

            System.out.println(list);


        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


}

