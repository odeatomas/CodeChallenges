public class RemoveUnwantedCharactersFromString {
    public static void main(String[]args){

    //use regular expression to remove unwanted characters
        //regex = [^a-zA-Z0-9- ] <- notice blank space to allow for spacing

    String charsToRemove = "$$%%^^&&&$$$*****Regular expression";

    charsToRemove = charsToRemove.replaceAll("[^a-zA-Z0-9- ]","");
    System.out.println(charsToRemove);
}}
