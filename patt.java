import java.util.Scanner;

class shop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        float avg = 0;
        

        for (int i = 1; i <= 3; i++) { 
            
            System.out.println("shop: " + i);
            

            System.out.print("Enter no of chocolate chips to distribute: ");
            int x = s.nextInt(); 
            System.out.print("Enter no of cake to distribute: ");
            int y = s.nextInt(); 
            System.out.print("Enter no of biscuits to distribute: ");
            int z = s.nextInt(); 

            sum = x + y + z + sum;
        }
        s.close();

        avg  =   (float)sum/9;
        System.out.println("Total sum: " + sum);
        System.out.println("Average is : "+(String.format("%.4f",avg)));
        
    }
}