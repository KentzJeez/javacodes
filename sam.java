class split{
    public static void main(String[]args){
        int value=2;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(value+" ");
                value=value+2;

                if(value==20)
                {
                    value=value+2;
                     continue;
                }
            }
            System.out.println();
        }
    }
}