import java.util.Arrays;

public class CompareString {

    String originalString = "Cat";
    String comparisonString = "cat";

    // compare method: convert to char array // lower case.
    public void compareCase() {
        char[] firstString = originalString.toLowerCase().toCharArray();
        char[] secondString = comparisonString.toLowerCase().toCharArray();



    // sort arrays passing converted string
        Arrays.sort(firstString);
        Arrays.sort(secondString);
    // compare strings using Arrays.equals if both match == print string match
        if (Arrays.equals(firstString, secondString)) {
            System.out.println("strings match ");
    // else print strings don't match
        } else {
            System.out.println("strings don't match ");
        }}
    // use compare method to compare string
    public static void main(String[] args) {
        CompareString compareString = new CompareString();
        compareString.compareCase();
    }}