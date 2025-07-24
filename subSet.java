import java.util.*;
public class subSet{
    public static void printSubSet(String str, int i, String ans){

        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        printSubSet(str , i+1, ans+str.charAt(i));
        printSubSet(str ,i+1 ,ans); ///BackTracking
    }
    public static void main(String args[]){
        String str = "abc";
        printSubSet(str ,0, " ");
    }
}