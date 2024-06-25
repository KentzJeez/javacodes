class loop {
    public static void main(String[] args) {
       
        
        int number = 5;
        int y = number - 1;
        int count = 1;

        for (int i = number; i >= 1; i--) {
            for (int j = y; j > 0; j--) {
                System.out.print("#" );
            }
            System.out.println(count);  
            y = y-1;
            count = count +1;
        }


    }
}