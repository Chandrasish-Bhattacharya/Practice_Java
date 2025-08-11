
import java.util.Scanner;

public class pallindrome{
    public static boolean checkpallindrome(String str, int left , int right){ // my approch 
        if(left>right){ 
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        
        return checkpallindrome(str, left+1, right-1);
        
    }
    // using one pointer
    public static boolean function(String str, int idx){
        if(idx>=(str.length()-1)/2+1){
            return true;
        }
        if(str.charAt(idx) != str.charAt(str.length() - 1 - idx)){
            return false;
        }
        return function(str, idx+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // char[] CharArray = str.toCharArray();
        // System.out.println(checkpallindrome(str, 0, str.length()-1));
        System.out.println(function(str, 0));

    }
}