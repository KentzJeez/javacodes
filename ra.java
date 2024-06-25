import java.util.Scanner;

class New {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Serial Number : ");
        String serial = input.nextLine();
        boolean status = true;

        System.out.println(serial.length());
           String code = serial.split("-")[0];
            int gasLevel = Integer.parseInt(serial.substring(3,5));
            int month = Integer.parseInt(serial.substring(6));
            
            String country = " ";
            String level = " ";


        if (serial.length() == 8) {
    
          

            if (code.equals("RU")) {
                country = "Russia";
            } else if (code.equals("ME")) {
                country = "Middle East";
            } else if (code.equals("IN")) {
                country = "India";
            } else {
                status = false;
            }
        }
            if(gasLevel > 0 && gasLevel <= 50){
                level = "Low LP Gas Percentage ";
            }
            else if(gasLevel > 50 && gasLevel <= 100){
                level = "High LP Gas percentage ";
            }
            else{
                status = false;
            }



            if (status ) {
                System.out.println("Your serial number is valid");
                System.out.println("validated details of the cylinder " );
                System.out.println("Imported from " +country);
                System.out.println(gasLevel+ "% " +level );
                System.out.println("Imported in month "+month );
            } else {
                System.out.println("Your serial number is invalid");
            }
              input.close();
        } 

      
    }
