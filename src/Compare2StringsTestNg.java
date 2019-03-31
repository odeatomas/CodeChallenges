import org.testng.Assert;
import org.testng.annotations.Test;
public class Compare2StringsTestNg {

    String successMessage = "Strings match";
    String failMessage = "Strings do not match";
    String str1="Cat";
    String str2="cat";
@Test
    public void compareTextAndCase(){
    //compare case and text
    try {
        Assert.assertEquals(str1, str2);
        System.out.println("Comparing string text and text case ->"+successMessage);
    }catch (AssertionError e){
        System.out.println("Comparing string text and text case ->"+failMessage);
    }}
@Test
    public void compareTextOnly(){
    //compare text only
    try {
        Assert.assertEquals(str1.toLowerCase(), str2.toLowerCase());
        System.out.println("Comparing string text only ->"+successMessage);
    }catch (AssertionError e){
        System.out.println("Comparing string text only ->"+failMessage);
    }}}
