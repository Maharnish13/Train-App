import java.util.*;

// Train Class using TreeSet
class Train {
    TreeSet<String> bogieIds = new TreeSet<>();

    // Add Bogie ID
    void addBogie(String id) {
        if (!bogieIds.add(id)) {
            System.out.println("❌ Duplicate ID! Not allowed.");
        } else {
            System.out.println("✅ Bogie added.");
        }
    }

    // Remove Bogie ID
    void removeBogie(String id) {
        if (bogieIds.remove(id)) {
            System.out.println("✅ Bogie removed.");
        } else {
            System.out.println("❌ Bogie not found.");
        }
    }

    // Display Sorted Bogies
    void displayBogies() {
        if (bogieIds.isEmpty()) {
            System.out.println("No bogies in train!");
            return;
        }

        System.out.println("🚆 Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
    }
}

// Main Class
public class TrainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Train train = new Train();

        while (true) {
            System.out.println("\n--- UC4 Menu ---");
            System.out.println("1. Add Bogie ID");
            System.out.println("2. Remove Bogie ID");
            System.out.println("3. Display Sorted Bogies");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Bogie ID: ");
                    train.addBogie(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter Bogie ID: ");
                    train.removeBogie(sc.nextLine());
                    break;

                case 3:
                    train.displayBogies();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}