import java.util.Scanner;

class New {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Serial Number : ");
        String serial = input.nextLine();
        boolean status = true;

        System.out.println(serial.length());
         String code = serial.split("-")[0];
         System.out.println(code);

         if (serial.length() == 8) {
            System.out.println( "hellow");
         }

    }
}