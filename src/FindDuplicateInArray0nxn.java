public class FindDuplicateInArray0nxn {


    public static void main(String[]args){
        String names [] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};
        // compare each element using 0(nxn)
        // get string length and iterate.
        // timing is 0(nxn)
        for (int i =0; i<names.length; i++){
            for (int j = i+1; j<names.length; j++ ){
                //compare each length
                if(names[i].equals(names[j])){
                    System.out.println("duplicate name is "  + names[i]);
}}}}}
