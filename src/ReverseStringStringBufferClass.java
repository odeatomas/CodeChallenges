public class ReverseStringStringBufferClass {

    public static void main (String[]args){
        String stringToReverse = "Reverse String";
        StringBuffer sb = new StringBuffer(stringToReverse);
        System.out.println(sb.reverse());
    }
}
