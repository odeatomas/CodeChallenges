import java.util.Arrays;

public class CompareString {

    String originalString = "Cat";
    String comparisonString = "cat";

    // compare method: convert to strings to char array
    public void compare() {
        char[] firstString = originalString.toCharArray();
        char[] secondString = comparisonString.toCharArray();
    // sort arrays passing converted string
        Arrays.sort(firstString);
        Arrays.sort(secondString);

    // compare strings using Arrays.equals if both match == print string match
        if (Arrays.equals(firstString, secondString) == true) {
            System.out.println("strings match ");
    // else print strings don't match
        } else {
            System.out.println("strings don't match ");
        }}

    // use compare method to compare string
    public static void main(String[] args) {
        CompareString compareString = new CompareString();
        compareString.compare();
    }}