import java.util.*;
import java.util.stream.*;

// Bogie Class
class Bogie {
    String id;
    String type; 
    int capacity;

    public Bogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }
}

// Train Class
class Train {
    List<Bogie> bogies = new ArrayList<>();

    // Add Bogie
    void addBogie(String id, String type, int capacity) {
        bogies.add(new Bogie(id, type, capacity));
    }

    // Group by Type
    void groupByType() {
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        System.out.println("🚆 Bogies Grouped by Type:");

        for (String type : grouped.keySet()) {
            System.out.println("\nType: " + type);
            for (Bogie b : grouped.get(type)) {
                System.out.println("ID: " + b.id +
                        ", Capacity: " + b.capacity);
            }
        }
    }
}

// Main Class
public class TrainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Train train = new Train();

        while (true) {
            System.out.println("\n--- UC9 Menu ---");
            System.out.println("1. Add Bogie");
            System.out.println("2. Group by Type");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Type: ");
                    String type = sc.nextLine();
                    System.out.print("Enter Capacity: ");
                    int cap = sc.nextInt();
                    train.addBogie(id, type, cap);
                    break;

                case 2:
                    train.groupByType();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}