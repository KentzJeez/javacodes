import java.util.Scanner;

class Imei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the IMEI:");
        String imei = scanner.next();
        String country = " ";
        boolean status = true;

        if (imei.length() == 14) {
            String countryCode = imei.substring(6, 8);

            if (countryCode.equals("01") || countryCode.equals("10")) {
                country = "Your mobile is manufactured in Finland";
            } else if (countryCode.equals("13")) {
                country = "Assembled in Azerbaijan";
            } else if (countryCode.equals("02") || countryCode.equals("20")) {
                country = "Assembled in Emirates and poor quality";
            } else {
                status = false;
            }
        } else {
            status = false;
        }

        if (status) {
            System.out.println("Your IMEI is valid");
            System.out.println("Manufactured in " + country);
        } else {
            System.out.println("Your serial number is invalid");
        }
    }
}
