import java.util.*;
import java.util.regex.*;

// Validator Class
class Validator {

    // Validate Train ID
    static boolean isValidTrainId(String id) {
        String pattern = "^TRN-\\d{4}$";
        return Pattern.matches(pattern, id);
    }

    // Validate Cargo Code
    static boolean isValidCargoCode(String code) {
        String pattern = "^CG-[A-Z]{3}$";
        return Pattern.matches(pattern, code);
    }
}

// Main Class
public class TrainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        if (Validator.isValidTrainId(trainId)) {
            System.out.println("✅ Valid Train ID");
        } else {
            System.out.println("❌ Invalid Train ID");
        }

        System.out.print("Enter Cargo Code: ");
        String cargo = sc.nextLine();

        if (Validator.isValidCargoCode(cargo)) {
            System.out.println("✅ Valid Cargo Code");
        } else {
            System.out.println("❌ Invalid Cargo Code");
        }
    }
}