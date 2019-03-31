public class ReverseStringForLoop {
    public static void main(String[]args){

        // Reverse a string using a for loop
        // print revesed string outside the for loop
        String stringToReverse = "Reverse String";

        int len = stringToReverse.length();
        String reversed = "";

        for(int i =len-1; i>=0; i--) {
            reversed = reversed + stringToReverse.charAt(i);
        }
        System.out.println(reversed);
    }
}
