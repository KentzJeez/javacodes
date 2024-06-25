import java.util.Scanner;
class jan
{
    public static void main (String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the DIN");
        String DIN = scanner.nextLine();
        boolean status=true;
        String town=" ";
       

        
        if(DIN.length()==19)
        {
            String towncode=DIN.substring(2, 5);
            if(towncode.equals("312"))
            {
                town="Colombo";
            }
            else if(towncode.equals("415"))
            {
                town="Kandy";
            }
            else if(towncode.equals("796"))
            {
                town="Jaffna";
            }
            else{
                status=false;
            }   
        
        if(status==true)
        {
            System.out.println("Your DIC is valid");
            System.out.println("Your blood donation facility is "+town);
        }
        else{
            System.out.println("Invalid DIC");
        }
        }
        else{
                System.out.println("Invalid DIC");
            }   

        scanner.close();
    }
}
