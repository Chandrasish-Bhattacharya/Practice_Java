
import java.util.Scanner;


public class printNto1usingbacktracking{
    public static void printNto1(int i,int n){
        if(i>n) return;
        printNto1(i+1, n);
        System.out.print(i + " ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        sc.close();
        printNto1(1,n);
    }
}