import java.util.Scanner;

class Din {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the DIN : ");
        String din = input.next();
        boolean status = true;
        String town = " ";

        if (din.length() == 19) {
            String code = din.split(" ")[0];
            int digit = Integer.parseInt(din.substring(2, 5));
            
            if (digit == 312) {
                town = "Colombo";
            } else if (digit == 415) {
                town = "Kandy";
            } else if (digit == 796) {
                town = "Jaffna";
            } else {
                status = false;
            }
        
            if (status) {
                System.out.println("Your DIN is valid");
                System.out.println("Your blood donation facility is " +town);
            } else {
                System.out.println("Your serial number is invalid");
            }
        }else {
                System.out.println("Your serial number is invalid");
            }
    }
}