public class swap2StringsWithoutUsing3rd {

    public static void main (String[]args){

        //swap string without using a 3rd variable
        String a = "hello ";
        String b = "world";

        System.out.println("before swap: ");
        System.out.println("the value of a is " + a);
        System.out.println("the value of b is " + b);

        //1: append a and b
        a = a+b; //hello world

        //2: store initial string a in sting b
        b = a.substring(0, a.length()-b.length());

        //3: store initial string b  in string a
        a = a.substring(b.length());

        System.out.println("the value of a and b after swapping");

        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);



    }
}
