import java.util.Scanner;
class spain
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the serial code");
        String code=scanner.nextLine();
        int gaslevel=0;
        int month=0;
        boolean status=true;
        String country=" ";
        String comment=" ";


        if(code.length()==8)
        {
            String countrycode=code.substring(0,2);
            if(countrycode.equals("RU"))
            {
                country ="Russia";
            }
            else if(countrycode.equals("ME"))
            {
                country="Middle East";
            }
            else if(countrycode.equals("IN"))
            {
                country="India";
            }
            else
            {
                status=false;
            }

            gaslevel=Integer.parseInt(code.substring(3,5));
            month=Integer.parseInt(code.substring(6));
            if(gaslevel>0 && gaslevel<=50)
            {
                comment="Low LP Gas Percentage";
            }
            else if(gaslevel>50 && gaslevel<=100)
            {
                comment="High LP Gas Percentage";
            }
            else
            {
                status=false;
            }
            if(status)
            {
                System.out.println("Your serial Number is Valid");
                System.out.println("Validated details of the Cylinder");
                System.out.println("Imported from "+country);
                System.out.println(gaslevel+" % "+comment);
                System.out.println("Imported on month" +month);
            }
            else
            {
                System.out.println("Your serial Number is Invalid");
            }

        } else
            {
                System.out.println("Your serial Number is Invalid");
            }
        scanner.close();

    }
}