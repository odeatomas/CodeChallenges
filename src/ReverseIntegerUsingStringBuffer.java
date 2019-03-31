public class ReverseIntegerUsingStringBuffer {
    public static void main(String[]args){

        //String buffer
        //use String.valueOf and pass num
        //string buffer is a mutable object which allows .reverse
        //https://stackoverflow.com/questions/2971315/string-stringbuffer-and-stringbuilder
        long numberToReverse = 123456789;
        System.out.println(new StringBuffer(String.valueOf(numberToReverse)).reverse());
        }
}
