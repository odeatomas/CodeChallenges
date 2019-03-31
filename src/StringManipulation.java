public class StringManipulation {
    public static void main(String[]args){

        String str = "String to manipulate";

        //print length of string
        //do not use size - size is array list - list objects

        //print string length
        System.out.println("String length " + str.length());
        //print the 6th char remember index starts ar 0
        System.out.println("6th Character " + str.charAt(5));
        //print the index value of given letter
        System.out.println("Index value of s  " + (str.indexOf("S")));
        // 2nd occurrence  of i
        System.out.println("2 occurrence  of i " +(str.indexOf("i")+1));
        //check for index of present word
        System.out.println("String index of word to " + (str.indexOf("to")));
        //check for index of word not present
        System.out.println("Word not found in string should give -1 " + str.indexOf("java"));

        //Compare strings passing sting  // boolean - true
        System.out.println(str.equals(str));

        //Compare string passing text // false
        System.out.println(str.equals("Strings to manipulate"));

    }
}
