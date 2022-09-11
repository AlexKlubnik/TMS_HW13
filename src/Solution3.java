import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {

        Map<String, List<String>> food = new HashMap<>();
        food.put("fruits", new ArrayList<>());
        food.put("berries", new ArrayList<>());
        food.put("vegetables", new ArrayList<>());


        System.out.println("""
                Choose type of food:
                 "f" - for fruits;
                 "b" - for berries;
                 "v" - for vegetables.""");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int productCounter = 0;

            while (productCounter < 3) {// удалить sc.hasnext, сделать фори со счетчиком по вставляемым продуктам
                if (reader.readLine().equals("f")) {
                    food.get("fruits").add(reader.readLine());
                    productCounter++;
                } else if (reader.readLine().equals("b")) {
                    food.get("berries").add(reader.readLine());
                    productCounter++;
                } else if (reader.readLine().equals("v")) {
                    food.get("vegetables").add(reader.readLine());
                    productCounter++;
                }

            }

            System.out.println(food);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

