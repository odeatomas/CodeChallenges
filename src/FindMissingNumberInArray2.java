public class FindMissingNumberInArray2 {
    public static void main(String[] args) {

        int[] arr = {10,9,3,6,4,7,8,1,2};
        int length = arr.length;
        int result = arr.length + 1;

        for (int i = 0; i < length; i++) {

            result += i + 1 - arr[i];
        }

        System.out.println("Missing number is: "+result);
    }
}
