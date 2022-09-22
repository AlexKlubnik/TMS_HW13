import java.util.*;

public class Solution3 {

    public static void main(String[] args) {

        Map<String, List<String>> products = new HashMap<>();
        products.put("fruits", new ArrayList<>());
        products.put("berries", new ArrayList<>());
        products.put("vegetables", new ArrayList<>());


        try (Scanner scanner = new Scanner(System.in)) {

            int productCounter = 0;
            while (true) {


                System.out.println("""
                        Choose type of food:
                         "f" - for fruits;
                         "b" - for berries;
                         "v" - for vegetables.""");
                String category = scanner.nextLine();

                System.out.println("Enter the product:");
                String product = scanner.nextLine();

                switch (category) {
                    case "f":
                        products.get("fruits").add(product);
                        productCounter++;
                        break;
                    case "b":
                        products.get("berries").add(product);
                        productCounter++;
                        break;
                    case "v":
                        products.get("vegetables").add(product);
                        productCounter++;
                        break;
                }
                if (productCounter == 10) {
                    break;
                }
            }
            for (Map.Entry<String, List<String>> entry : products.entrySet()) {
                System.out.println("Category: " + entry.getKey() + " - products: " + entry.getValue());
            }
        }

    }
}

