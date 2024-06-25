import java.util.Scanner;
class month
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter Date and Time as dd/mm/yyyy hh:mm");
        String time=scanner.nextLine();
        
        String day=" ";
        String month=" ";
        String year=" ";
        int hour;
        String hourminutes=" ";
        String lol;

       
        if(time.length()==16)
        {
        day=time.substring(0, 2);
        month=time.substring(3, 5);
        year=time.substring(6, 10);
        hourminutes=time.substring(11, 16);
        hour=Integer.parseInt(time.substring(11, 13));
        if(hour>=12)
        {
            lol=("PM");
        }
        else{
            lol=("AM");
        }
        System.out.println(month+"-"+day+"-"+year+" "+hourminutes+" "+lol);
        }
        else{
            System.out.println("Invalid input");
        }
         scanner.close();
    }
   
}