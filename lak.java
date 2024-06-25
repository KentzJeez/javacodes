class two
{
    public static void main(String[]args)
    {
        for(int i=2;i<28;i+=2)
        {
            for(int j=1;j<5;j++)
            {
                if(i==20)
                {
                    continue;
                }
                System.out.print(i+" ");
                 i+=2;
               
            }
             
            System.out.println();
        }
    }
}