public class FindMissingNumberInArray0 {
    public static void main(String[] args){

        //sting to find missing numbers in sequence
        int a[] = {1,2,3,4,5,7};
        //1+2+3+4+5+7=22
        //1+2+3+4+5+6+7=28
        //28 - 22 = 6

        //create a variable for the sum
        int sum =0;
        //start at index value 0 and sum for the sequence .length and iterate
        for(int i = 0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println(sum);
        int sum1 = 0;
        //specify the max value of sequence
        for(int j=1; j<=7; j++){
            sum1 = sum1 + j;
        }
        System.out.println(sum1);
        //subtract sum from sum1
        System.out.println("missing number is   "+(sum1-sum));
    }
}
