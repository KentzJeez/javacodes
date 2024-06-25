import java.util.Scanner;

class SerialValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your serial Number:");
        String serial = scanner.next();
        boolean status = true;

        int GasLevel = 0;
        int Month = 0;
        String Country = ""; // Initialize Country with an empty string

        if (serial.length() == 8) {
            String CountryCode = serial.substring(0, 2);
            
            // Adjusted indices for GasLevel substring
            GasLevel = Integer.parseInt(serial.substring(3, 5));
            Month = Integer.parseInt(serial.substring(6));

            if (CountryCode.equals("RU")) {
                Country = "Russia";
            } else if (CountryCode.equals("ME")) {
                Country = "Middle East";
            } else if (CountryCode.equals("IN")) {
                Country = "India";
            } else {
                status = false;
            }
        }

        String level = " ";
        if (GasLevel > 0 && GasLevel < 50) {
            level = "Low LP Gas Percentage";
        } else if (GasLevel >= 50 && GasLevel <= 100) {
            level = "High LP Gas Percentage";
        } else {
            status = false;
        }

        if (status) {
            System.out.println("Your serial Number is valid");
            System.out.println("Validated details of the cylinder");
            System.out.println("Imported from " + Country);
            System.out.println(GasLevel + " %" + level);
            System.out.println("Imported in month " + Month);
        } else {
            System.out.println("Your serial Number is invalid");
        }
    }
}

