import java.util.Scanner;
class candy
{
    public static void main (String []args)

    {
        float sum=0;
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<=3;i++)
        {
            System.out.println("Shop "+i);
            System.out.print("Enter no of choclate chips to distribute: ");
            int cc=scanner.nextInt();
            System.out.print("Enter no of cake to distribute: ");
            int c=scanner.nextInt();
            System.out.print("Enter no of bisquit to distribute: ");
            int b=scanner.nextInt();

            sum=cc+c+b+sum;

        }scanner.close();
        float avg=sum/9;

        System.out.println("Average is "+avg);
    }
}