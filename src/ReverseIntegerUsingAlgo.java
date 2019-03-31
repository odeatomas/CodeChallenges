public class ReverseIntegerUsingAlgo {

    public static void main(String[] args){
        long numToReverse = 123456789;
        long reverse = 0;

        while (numToReverse!=0){
            reverse = reverse *10 + numToReverse %10;
            numToReverse = numToReverse / 10;

        }
        System.out.println("Reversed number is " + reverse);

    }
}
