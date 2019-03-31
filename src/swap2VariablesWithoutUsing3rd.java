public class swap2VariablesWithoutUsing3rd {
    public static void main(String [] args){

        // Code to swap 'x' and 'y' without using a third variable

        // using math operators + -
        int x = 5;
        int y = 10;
        x = x + y;  // x is 15
        y = x - y;  // y is 10
        x = x - y;  // x is 5
        System.out.println("x is " + x );
        System.out.println("y is " + y );


        // using math operators * /
        int x0 = 5;
        int y0 = 10;
        x0 = x0*y0; // x is 50
        y0 = x0/y0; // y is 10
        x0 = x0/y0; // x is 5
        System.out.println("x is " + x0 );
        System.out.println("y is " + y0 );


        // using xor
        int x1 = 5;
        int y1 = 10;
        x1 = x1 ^ y1;  // x is 15 (1111)
        y1 = x1 ^ y1;  // y is 10 (1010)
        x1 = x1 ^ y1;  // x is 5 (0101)
        System.out.println("x  is " + x1 );
        System.out.println("y is " + y1 );

    }
}
