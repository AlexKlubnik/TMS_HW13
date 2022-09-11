import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    public static void main(String[] args) {
        File file = new File("text13_1.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String temp;

            Set<String> set = new HashSet<>();

            while ((temp = br.readLine()) != null) {
                set.addAll(Arrays.asList(temp.split("\\W")));
            }
            System.out.println(set);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
