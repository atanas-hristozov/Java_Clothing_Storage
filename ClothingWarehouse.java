import java.util.*;

public class ClothingWarehouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> clothesCount = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String brand = scanner.nextLine();
            clothesCount.put(brand, clothesCount.getOrDefault(brand, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : clothesCount.entrySet()) {
            String brand = entry.getKey();
            int count = entry.getValue();
            String isEven = (count % 2 == 0) ? "Yes" : "No";
            System.out.println(brand + " " + count + " " + isEven);
        }
    }
}
